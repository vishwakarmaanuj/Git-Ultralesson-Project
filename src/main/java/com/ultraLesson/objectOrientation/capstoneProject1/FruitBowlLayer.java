package com.ultraLesson.objectOrientation.capstoneProject1;

public class FruitBowlLayer extends FruitLayer1 {
    private String name;
    private String taste;
    private String color;
    private double quantity;

    public FruitBowlLayer(String name, String taste, String color, double quantity) {
        this.name = name;
        this.taste = taste;
        this.color = color;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "FruitBowlLayer{" +
                "name='" + name + '\'' +
                ", taste='" + taste + '\'' +
                ", color='" + color + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
