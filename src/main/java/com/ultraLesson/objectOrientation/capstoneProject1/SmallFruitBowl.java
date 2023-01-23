package com.ultraLesson.objectOrientation.capstoneProject1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmallFruitBowl {
    private List<Fruit> fruitList = new ArrayList<>();

    public void addFruit(Fruit... fruit) {
        this.fruitList.addAll(Arrays.asList(fruit));

    }
    public void addFruit(Fruit fruit) {
        this.fruitList.add(fruit);

  }
    public List<Fruit> getFruits() {
        return fruitList;
    }

    @Override
    public String toString() {
        return "SmallFruitBowl{" +
                "fruitList=" + fruitList +
                '}';
    }
//    public void addFruits(Fruit apple,Fruit orange,Fruit cherry){
//
//    }

}
