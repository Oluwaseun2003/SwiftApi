package com.Ecommece.product.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long customerId;


    @CreationTimestamp
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime orderDate;

@OneToMany(mappedBy = "order")
    private ArrayList<OrderItems> orderItems;

    public Order() {
    }

    public Order(Long id, Long customerId, LocalDateTime orderDate, ArrayList<OrderItems> orderItems) {
        this.id = id;
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.orderItems = orderItems;
    }


    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public ArrayList<OrderItems> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(ArrayList<OrderItems> orderItems) {
        this.orderItems = orderItems;
    }



    @Override
    public String toString() {
        return "Order{" +
                ", id=" + id +
                ",customerId=" + customerId +
                ", orderDate=" + orderDate +
                ", orderItems=" + orderItems +
                '}';
    }
}