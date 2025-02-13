package com.eshoppingmall.repository;

import com.eshoppingmall.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
