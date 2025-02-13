package com.eshoppingmall.exception;

public class SaleNotFoundException extends RuntimeException {
    public SaleNotFoundException(Long id) {
        super("Sale not found: " + id);
    }
}
