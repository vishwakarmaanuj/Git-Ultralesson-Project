package com.ultraLesson.objectOrientation.capstoneProject1;

import java.util.ArrayList;
import java.util.List;

public class FruitBowl {

    private List<Fruit> fruitList;

    public FruitBowl() {
        this.fruitList = new ArrayList<>();
    }

    public FruitBowl(List<Fruit> fruits) {
        this.fruitList = fruits;
    }

    public void remove(Fruit fruit) {
        fruitList.remove(fruit);
    }

    public List<Fruit> getFruits() {
        return fruitList;
    }

}