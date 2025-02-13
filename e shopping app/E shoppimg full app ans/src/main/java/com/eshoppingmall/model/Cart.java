package com.eshoppingmall.model;

import javax.persistence.*;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartId;
    private float subTotal;
    private float total;

    // Getters and Setters
}
