package com.ultraLesson.objectOrientation.capstoneProject1;

import java.util.ArrayList;
import java.util.List;

public class FruitBowl {
    private List<FruitLayer1> fruitLayer1List = new ArrayList<>();

    public void addFruits(FruitLayer1 fruitLayer1) {
        this.fruitLayer1List.add(fruitLayer1);

    }

    public void show3() {
        for (int i = 0; i < fruitLayer1List.size(); i++) {
            System.out.print(fruitLayer1List.get(i));
        }
    }

    public static void main(String[] args) {
        FruitBowl fruitBowl = new FruitBowl();
        FruitBowlLayer apple = new FruitBowlLayer("apple", "sweet", "red", 5.2);
        FruitBowlLayer cherry = new FruitBowlLayer("cherry", "red", "sweet", 2);
        FruitBowlLayer orange = new FruitBowlLayer("orange", "yellow", "sweet", 2);
        fruitBowl.addFruits(apple);
        fruitBowl.show3();
        fruitBowl.fruitLayer1List.clear();
        System.out.println();
        fruitBowl.addFruits(cherry);
        fruitBowl.show3();
        System.out.println();
        fruitBowl.fruitLayer1List.clear();
        fruitBowl.addFruits(orange);
        fruitBowl.show3();

    }

}
