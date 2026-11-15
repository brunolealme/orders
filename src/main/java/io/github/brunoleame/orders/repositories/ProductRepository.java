package io.github.brunoleame.orders.repositories;

import io.github.brunoleame.orders.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {}
