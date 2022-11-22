package com.ultraLesson.objectOrientation.aggregation;

public class Scale  extends  Stationary{
    private int length;
    private int width;
    private int height;
    private int metric;

    public Scale(int length, int width, int height, int metric) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.metric = metric;
    }

    public int measure(int metric){
        return 0;
    }

    @Override
    public String toString() {
        return "Scale{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", metric=" + metric +
                '}';
    }
}
