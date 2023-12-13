package com.Ecommece.product.dto;

public class ProductDto {
    private String productName;
    private String productDescrip;
    private double productAmount;
    private int stockQuantity;

    public ProductDto() {
    }

    public ProductDto(String productName, String productDescrip, double productAmount, int stockQuantity) {
        this.productName = productName;
        this.productDescrip = productDescrip;
        this.productAmount = productAmount;
        this.stockQuantity = stockQuantity;
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

    @Override
    public String toString() {
        return "ProductDto{" +
                "productName='" + productName + '\'' +
                ", productDescrip='" + productDescrip + '\'' +
                ", productAmount=" + productAmount +
                ", stockQuantity=" + stockQuantity +
                '}';
    }
}
