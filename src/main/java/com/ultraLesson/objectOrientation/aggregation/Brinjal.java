package com.ultraLesson.objectOrientation.aggregation;

public class Brinjal extends Basket {
    private String color;
    private String shape;
    private String taste;

    public Brinjal(String color, String shape, String taste) {
        this.color = color;
        this.shape = shape;
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Brinjal{" +
                "color='" + color + '\'' +
                ", shape='" + shape + '\'' +
                ", taste='" + taste + '\'' +
                '}';
    }

    public void tasteOfBrinjal(){
    System.out.println("tasteLess");
}
}
