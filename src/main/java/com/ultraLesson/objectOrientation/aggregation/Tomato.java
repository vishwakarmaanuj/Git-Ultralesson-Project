package com.ultraLesson.objectOrientation.aggregation;

public class Tomato extends Basket {
    private String color;
    private String taste;
    private String shape;

    public Tomato(String color, String taste, String shape) {
        this.color = color;
        this.taste = taste;
        this.shape=shape;
    }

    @Override
    public String toString() {
        return "Tomato{" +
                "color='" + color + '\'' +
                ", taste='" + taste + '\'' +
                ", shape='" + shape + '\'' +
                '}';
    }

    public void tasteOfTomato() {
        System.out.println("sweet");
    }

}
