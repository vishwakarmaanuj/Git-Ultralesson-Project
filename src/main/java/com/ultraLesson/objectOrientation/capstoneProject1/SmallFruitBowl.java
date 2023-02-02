package com.ultraLesson.objectOrientation.capstoneProject1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmallFruitBowl {
    private String fruit;
    private String color;
    private String type;
    private String size;
    private List<Fruit> fruitList = new ArrayList<>();

    public SmallFruitBowl() {
        this.fruitList = new ArrayList<>();
    }

    public SmallFruitBowl(List<Fruit> fruits) {
        this.fruitList = fruits;
    }

    public SmallFruitBowl(Fruit fruit) {
        fruitList.add(fruit);
    }


    public void add(Fruit fruit) {
        fruitList.add(fruit);
    }


    public void remove(Fruit fruit) {
        fruitList.remove(fruit);
    }

    public List<Fruit> returnFruits() {
        return fruitList;
    }


    @Override
public String toString(){
     return "FruitBowlLayer{" +
             "fruit='" + fruit + '\'' +
            ", color='" + color + '\'' +
            ", type='" + type + '\'' +
            ", size='" + size + '\'' +
            '}';
}

}