package io.github.brunoleame.orders.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "order_product")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class OrderItem {
    @Id
    private Long id;
    private Order order;
    private Product product;
    private Integer quantity;
    private BigDecimal price;
}
