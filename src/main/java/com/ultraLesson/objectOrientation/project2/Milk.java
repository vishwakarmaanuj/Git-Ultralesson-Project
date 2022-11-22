package com.ultraLesson.objectOrientation.project2;

public class Milk {
    private String taste;
    private String shape;
    private double cost;

    public Milk(String taste, String shape, double cost) {
        this.taste = taste;
        this.shape = shape;
        this.cost = cost;
    }

    public String getTaste() {
        return taste;
    }

    public String getShape() {
        return shape;
    }

    public double getCost() {
        return cost;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
