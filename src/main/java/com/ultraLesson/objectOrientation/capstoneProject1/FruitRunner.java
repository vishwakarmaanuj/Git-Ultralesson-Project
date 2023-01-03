package com.ultraLesson.objectOrientation.capstoneProject1;

public class FruitRunner {
    public static void main(String[] args) {
        FruitBowl fruitBowl = new FruitBowl();
        Fruit apple = new Fruit("apple", "sweet", "red", 5.2);
        Fruit cherry = new Fruit("cherry", "red", "sweet", 2);
        Fruit orange = new Fruit("orange", "yellow", "sweet", 2);
        fruitBowl.addFruit(apple,cherry,orange);
        System.out.println();



    }
}
