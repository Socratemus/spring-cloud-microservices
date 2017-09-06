package ro.microservices.inventory.service;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.microservices.inventory.config.KafkaGateway;
import ro.microservices.inventory.entities.Product;
import static ro.microservices.inventory.mappers.ProductMapper.toModel;
import static ro.microservices.inventory.mappers.ProductMapper.toEntity;
import ro.microservices.inventory.models.ProductModel;
import ro.microservices.inventory.repositories.ProductRepository;

@Service
public class ProductService {
	
	private final ProductRepository productRepository;
	
	private final KafkaGateway kafkaGateway;
	
	@Autowired
	public ProductService(ProductRepository productRepository, KafkaGateway kafkaGateway) {
		this.productRepository = productRepository;
		this.kafkaGateway = kafkaGateway;
	}
	
	public ProductModel save(ProductModel productModel) {
		Product product = productRepository.findByCode(productModel.getCode()).stream()
			.findFirst()
			.map(p -> {
				p.setPrice(productModel.getPrice());
				return p;
			})
			.map(updateStock(productModel))
			.orElseGet(() -> toEntity(productModel));
		return toModel(productRepository.save(product));
	}
	
	private Function<Product, Product> updateStock(final ProductModel productModel) {
		
		return p -> {
			Integer initStock = p.getStock();
			
			if(initStock != productModel.getStock()) {
				
				p.setStock(productModel.getStock());
				
				if(initStock == 0 || productModel.getStock() == 0) {
					kafkaGateway.write(productModel);
				}
			}
			
			return p;
		};
	}
	
}
