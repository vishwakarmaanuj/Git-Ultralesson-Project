package com.ultraLesson.objectOrientation.capstoneProject1;

import java.util.ArrayList;
import java.util.List;

public class FruitRunner {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("apple", "sweet", "red", 5.2));
        fruits.add(new Fruit("cherry", "bitter", "green", 2));
        fruits.add(new Fruit("orange", "sour", "orange", 2));
        fruits.add(new Fruit("grapes","sweet","red",3));
        fruits.add(new Fruit("Violet Grapes","sweet","voilet",3));
        FruitBowl bowl = new FruitBowl(fruits);
        MultiLayerFruitBowl layerBowl = new MultiLayerFruitBowl();
        Segregator segregator = new Segregator(bowl, layerBowl);
        segregator.segregateByColor();

    }
}
