package com.ultraLesson.objectOrientation.inheritance;

public class Horse extends Animal {
    public Horse(String color, int weight, int height, int numberOfLeg, int ear, int eye) {
        super(color, weight, height, numberOfLeg, ear, eye);
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

    public void horseRunFast() {
        System.out.println("Horse run fast");
    }

    public void eatGross() {
        System.out.println("Horse eat gross");
    }

//    @Override
//    public void runFast() {
//        super.runFast();
//    }

    public static void main(String[] args) {
        Horse horse = new Horse("colorful", 100, 7, 4, 2, 2);
        horse.horseRunFast();
        horse.sound();
//        horse.runFast();//lion method call
//        //horse.thickLeg();//elephant method call
//        horse.eatGross();//horse method call
    }
}
