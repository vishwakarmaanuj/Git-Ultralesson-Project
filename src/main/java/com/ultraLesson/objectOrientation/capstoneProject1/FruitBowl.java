package com.ultraLesson.objectOrientation.capstoneProject1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FruitBowl {
    private List<Fruit> fruitList = new ArrayList<>();

    public void addFruit(Fruit... fruit) {
        this.fruitList.addAll(Arrays.asList(fruit));

    }
    public void addFruit(Fruit fruit) {
        this.fruitList.add(fruit);

    }
    public void addFruits(Fruit apple,Fruit orange,Fruit cherry){

    }
    public void show3() {
        for (int i = 0; i < fruitList.size(); i++) {
            System.out.print(fruitList.get(i));
        }
    }
}
