package com.ultraLesson.objectOrientation.aggregation;

public class Sharpener extends Stationary{
    private int length;
    private int width;
    private int height;
    private String color;

    public Sharpener(int length, int width, int height, String color) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public void sharp(){
        System.out.println("used to sharp");
    }

    @Override
    public String toString() {
        return "Sharpener{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}
