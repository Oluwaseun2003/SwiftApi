package com.Ecommece.product.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;
    private String productDescrip;
    private double productAmount;
    private int stockQuantity;

    @CreationTimestamp
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dateAdded;

    @CreationTimestamp
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dateUpdated;

    public Product() {
    }

    public Product(Long id, String productName, String productDescrip, double productAmount, int stockQuantity, LocalDateTime dateAdded, LocalDateTime dateUpdated) {
        this.id = id;
        this.productName = productName;
        this.productDescrip = productDescrip;
        this.productAmount = productAmount;
        this.stockQuantity = stockQuantity;
        this.dateAdded = dateAdded;
        this.dateUpdated = dateUpdated;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescrip() {
        return productDescrip;
    }

    public void setProductDescrip(String productDescrip) {
        this.productDescrip = productDescrip;
    }

    public double getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(double productAmount) {
        this.productAmount = productAmount;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public LocalDateTime getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    public LocalDateTime getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(LocalDateTime dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productDescrip='" + productDescrip + '\'' +
                ", productAmount=" + productAmount +
                ", stockQuantity=" + stockQuantity +
                ", dateAdded=" + dateAdded +
                ", dateUpdated=" + dateUpdated +
                '}';
    }
}
