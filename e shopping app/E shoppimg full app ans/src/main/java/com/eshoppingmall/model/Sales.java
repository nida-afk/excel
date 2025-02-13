package com.eshoppingmall.model;

import javax.persistence.*;

@Entity
public class Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long saleId;
    private Long pid;
    private Long cid;
    private int quantity;
    private float totalAmount;

    // Getters and Setters
}
