package com.ultraLesson.objectOrientation.inheritance;

public class Lion extends Animal {

    public Lion(String color, int weight, int height, int numberOfLeg, int ear, int eye) {
        super(color, weight, height, numberOfLeg, ear, eye);
    }

    public void runFast() {
        System.out.println("Lion run fast");
    }

    public boolean eatNonVeg() {
        System.out.println("Lion eat non-veg");
        return false;
    }

    @Override
    public void eat() {
        super.eat();
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

}
