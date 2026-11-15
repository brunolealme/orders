package io.github.brunoleame.orders.repositories;

import io.github.brunoleame.orders.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
