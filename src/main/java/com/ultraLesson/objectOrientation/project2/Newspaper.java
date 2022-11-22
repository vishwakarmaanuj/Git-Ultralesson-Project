package com.ultraLesson.objectOrientation.project2;

public class Newspaper {
    private String contentType;
    private double cost;

    public Newspaper(String contentType, double cost) {
        this.contentType = contentType;
        this.cost = cost;
    }

    public String getContentType() {
        return contentType;
    }

    public double getCost() {
        return cost;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
