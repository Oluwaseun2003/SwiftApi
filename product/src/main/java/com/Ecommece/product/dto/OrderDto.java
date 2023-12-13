package com.Ecommece.product.dto;

import com.Ecommece.product.model.OrderItems;

import java.util.ArrayList;

public class OrderDto {
    private Long customerId;
    private ArrayList<OrderItems> orderItems;

    public OrderDto() {
    }

    public OrderDto( Long customerId, ArrayList<OrderItems> orderItems) {
        this.customerId = customerId;
        this.orderItems = orderItems;
    }



    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public ArrayList<OrderItems> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(ArrayList<OrderItems> orderItems) {
        this.orderItems = orderItems;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                ",customerId=" + customerId +
                ", orderItems=" + orderItems +
                '}';
    }
}
