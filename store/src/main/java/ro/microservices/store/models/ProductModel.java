package ro.microservices.store.models;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import ro.microservices.store.entities.Category;

@Data
@AllArgsConstructor
@Builder
public class ProductModel implements myinterface {

	private String code;
	
	private Category category;
	
	private BigDecimal price;
	
	private Integer stock;
	
}

interface myinterface {
	
	default String demo()  {
		return "i just demoed";
	}
	
}

	