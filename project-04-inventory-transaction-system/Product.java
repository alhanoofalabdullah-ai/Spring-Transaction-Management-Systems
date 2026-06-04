package com.inventory;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;

    private Integer stockQuantity;

    public Product() {
    }

    public Product(String productName, Integer stockQuantity) {
        this.productName = productName;
        this.stockQuantity = stockQuantity;
    }

    public Long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}
