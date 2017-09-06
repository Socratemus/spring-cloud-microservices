package ro.microservices.checkout.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@Builder
public class InventoryModel {

    private String code;

    private BigDecimal price;

    private Integer stock;

}
