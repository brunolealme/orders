package io.github.brunoleame.orders.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {

    @Id
    private Long productId;

    private String name;

    private Integer quantity;

    private BigDecimal price;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
