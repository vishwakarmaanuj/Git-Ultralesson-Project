package com.ultraLesson.objectOrientation.aggregation;

public class Radish extends Basket{
    private String color;
    private String taste;
    private  String shape;

    public Radish(String color, String taste, String shape) {
        this.color = color;
        this.taste = taste;
        this.shape = shape;
    }
    public void tasteOfradish(){
        System.out.println("bitter");
    }
    }

