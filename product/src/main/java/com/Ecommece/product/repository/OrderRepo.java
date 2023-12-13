package com.Ecommece.product.repository;

import com.Ecommece.product.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {
}
