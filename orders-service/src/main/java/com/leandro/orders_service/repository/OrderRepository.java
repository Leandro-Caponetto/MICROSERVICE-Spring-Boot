package com.leandro.orders_service.repository;

import com.leandro.orders_service.model.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
