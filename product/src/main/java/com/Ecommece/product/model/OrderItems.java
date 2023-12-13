package com.Ecommece.product.model;


import jakarta.persistence.*;

@Entity
public class OrderItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int quantity;

    private double subTotal;

    @ManyToOne(cascade = CascadeType.ALL, targetEntity = Order.class, fetch = FetchType.EAGER)
    @JoinColumn(referencedColumnName = "id", name = "order_id")
    private Order order;
    public OrderItems() {
    }

    public OrderItems(Long id, int quantity, double subTotal, Order order) {
        this.id = id;
        this.quantity = quantity;
        this.subTotal = subTotal;
        this.order = order;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "OrderItems{" +
                "Id=" + id +
                ", quantity=" + quantity +
                ", subTotal=" + subTotal +
                ", order=" + order +
                '}';
    }
}
