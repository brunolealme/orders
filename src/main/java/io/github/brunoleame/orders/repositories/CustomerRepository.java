package io.github.brunoleame.orders.repositories;

import io.github.brunoleame.orders.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
