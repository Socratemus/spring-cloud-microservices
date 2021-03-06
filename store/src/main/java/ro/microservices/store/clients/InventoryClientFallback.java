package ro.microservices.store.clients;

import java.math.BigDecimal;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;
import ro.microservices.store.models.InventoryModel;

@Component
public class InventoryClientFallback implements FallbackFactory<InventoryClient> {

	@Override
	public InventoryClient create(final Throwable throwable) {
		return new InventoryClient() {
			
			@Override			
			public ResponseEntity<InventoryModel> getProductInventory(String code) {
				return ResponseEntity.ok(
						InventoryModel.builder()
						.price(BigDecimal.ZERO)
						.stock(0)
						.build()
					);				
			}
		};
	}
}
