package com.ultraLesson.objectOrientation.methods;

public class Item {
    private String name;
    private double quantity;
    private String metric;

    public Item(String name, double quantity, String metric) {
        this.name = name;
        this.quantity = quantity;
        this.metric = metric;
    }

    protected String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getMetric() {
        return metric;
    }

}
