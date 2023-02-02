package com.ultraLesson.objectOrientation.capstoneProject1;

import java.util.ArrayList;
import java.util.List;

public class FruitRunner {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        Fruit apple = new Fruit("apple", "sweet", "red", 5.2);
        Fruit cherry = new Fruit("cherry", "bitter", "green", 2);
        Fruit orange = new Fruit("orange", "sour", "orange", 2);
        SmallFruitBowl bowl = new SmallFruitBowl(fruits);
        MultiLayerFruitBowl layerBowl = new MultiLayerFruitBowl();
        Segregator segregator = new Segregator(bowl, layerBowl);
        segregator.segregateByColor();
    }
}
