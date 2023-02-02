package com.ultraLesson.objectOrientation.capstoneProject1;

import java.util.List;

public class Fruit {
    private String name;
    private String taste;
    private String color;
    private double quantity;

    public Fruit(String name, String taste, String color, double quantity) {
        this.name = name;
        this.taste = taste;
        this.color = color;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public int getType() {
        return 0;
    }

//    @Override
//    public String toString() {
//        return "FruitBowlLayer{" +
//                "name='" + name + '\'' +
//                ", taste='" + taste + '\'' +
//                ", color='" + color + '\'' +
//                ", quantity=" + quantity +
//                '}';
//    }
}
