package com.Ecommece.product.repository;

import com.Ecommece.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
}
