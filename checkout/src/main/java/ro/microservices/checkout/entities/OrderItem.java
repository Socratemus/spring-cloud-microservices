package ro.microservices.checkout.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ro.microservices.checkout.models.ProductModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class OrderItem {

    @Id
    @GeneratedValue
    private Long id;

    private Integer quantity;

    private String product_code;

    //private ProductModel product;
}
