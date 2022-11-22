package com.ultraLesson.objectOrientation.project2;

public class Apple {
    private String color;
    private String taste;
    private double cost;

    public Apple(String color, String taste,double cost) {
        this.color = color;
        this.taste = taste;
        this.cost=cost;
    }

    public String getColor() {
        return color;
    }

    public String getTaste() {
        return taste;
    }

    public double getCost() {
        return cost;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
