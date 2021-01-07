package com.angelica.exercise;

public class Product {
    private int price;
    private int productId;
    private String name;
    private int quantity;

    public Product(int price, int productId, String name, int quantity) {
        this.price = price;
        this.productId =productId;
        this.name = name;
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
