package com.ultraLesson.objectOrientation.inheritance;

public class Elephant extends Animal {

    public Elephant(String color, int weight, int height, int numberOfLeg, int ear, int eye) {
        super(color, weight, height, numberOfLeg, ear, eye);
    }
    @Override
    public void sound() {
        super.sound();
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void swim() {
        super.swim();
    }

    public void thickLeg() {
        System.out.println("Elephant has thick leg");
    }
    public void lionSound(){
        System.out.println("lion is roaring");
    }
}
