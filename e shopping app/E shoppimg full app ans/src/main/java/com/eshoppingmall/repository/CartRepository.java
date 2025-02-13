package com.eshoppingmall.repository;

import com.eshoppingmall.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
