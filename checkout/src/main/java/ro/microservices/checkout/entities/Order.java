package ro.microservices.checkout.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Order {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany
    private List<OrderItem> orderItems;

    @Column(nullable = false)
    private BigDecimal total;

}
