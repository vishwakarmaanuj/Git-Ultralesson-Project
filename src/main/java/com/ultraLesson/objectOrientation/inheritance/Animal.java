package com.ultraLesson.objectOrientation.inheritance;

public class Animal {
    private String color;
    private int weight;
    private int height;
    private int numberOfLeg;
    private int ear;
    private int eye;

    public Animal(String color, int weight, int height, int numberOfLeg, int ear, int eye) {
        this.color = color;
        this.weight = weight;
        this.height = height;
        this.numberOfLeg = numberOfLeg;
        this.ear = ear;
        this.eye = eye;
    }

    public void eat() {
        System.out.println("Animal eat");
    }

    public void sound() {
        System.out.println("Animals Sounds");
    }

    public void move() {
        System.out.println("Animals Move");
    }

    public void swim() {
        System.out.println("Animals Swim");
    }

    public static void main(String[] args) {

    }
}

