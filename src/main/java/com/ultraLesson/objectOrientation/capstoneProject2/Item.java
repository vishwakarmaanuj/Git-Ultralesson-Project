package com.ultraLesson.objectOrientation.capstoneProject2;

public class Item {
    private String name;
    private double totalPrice;
    private String brand;
    private int quantity;

    public Item(String name, double totalPrice, String brand, int quantity) {
        this.name = name;
        this.totalPrice = totalPrice;
        this.brand = brand;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalPrice(String price) {
        this.totalPrice = totalPrice;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", totalPrice=" + totalPrice +
                ", brand='" + brand + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getBrand() {
        return brand;
    }
}
