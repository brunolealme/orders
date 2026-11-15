package io.github.brunoleame.orders.repositories;

import io.github.brunoleame.orders.domain.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OderItemRepository extends JpaRepository<OrderItem, Long> {
}
