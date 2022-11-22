package com.ultraLesson.objectOrientation.aggregation;

public class Pencil extends Stationary{
    private int length;
    private int height;
    private String color;
    private int width;

    public Pencil(int length, int height, String color, int width) {
        this.length = length;
        this.height = height;
        this.color = color;
        this.width = width;
    }
    public void draw(){
        System.out.println("pencil is used to draw somethings");
    }

    @Override
    public String toString() {
        return "Pencil{" +
                "length=" + length +
                ", height=" + height +
                ", color='" + color + '\'' +
                ", width=" + width +
                '}';
    }
}
