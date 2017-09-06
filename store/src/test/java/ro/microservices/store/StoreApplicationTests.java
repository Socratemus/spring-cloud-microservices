package ro.microservices.store;

import java.math.BigDecimal;

import org.junit.Test;

import ro.microservices.store.entities.Category;
import ro.microservices.store.models.ProductModel;

public class StoreApplicationTests {

	@Test
	public void contextLoadsThemNUTS() {
		
		ProductModel pm = new ProductModel("P1", new Category(), new BigDecimal(10), 1);
		
		System.out.println(pm.demo());
		
	}

}
