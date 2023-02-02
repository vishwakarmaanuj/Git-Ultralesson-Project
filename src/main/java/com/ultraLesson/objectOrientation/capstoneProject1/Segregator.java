package com.ultraLesson.objectOrientation.capstoneProject1;

import java.util.ArrayList;
import java.util.List;
public class Segregator {
    private final SmallFruitBowl frtBowl;
    private final MultiLayerFruitBowl segregatedBowl;

    List<String> fruitsFirstLayer = new ArrayList<>();
    List<String> fruitsSecondLayer = new ArrayList<>();
    List<String> fruitsThirdLayer = new ArrayList<>();

    public Segregator(SmallFruitBowl mixedBowl, MultiLayerFruitBowl emptyLayerBowl) {
        this.frtBowl = mixedBowl;
        this.segregatedBowl = emptyLayerBowl;
    }

    public void segregateByColor() {
        System.out.println("Fruits Segregated by Color: ");
        for (Fruit fruit : frtBowl.returnFruits()) {
            switch (fruit.getColor()) {
                case "red":
                    fruitsFirstLayer.add(fruit.getName());
                    break;
                case "green":
                    fruitsSecondLayer.add(fruit.getName());
                    break;
                case "orange":
                    fruitsThirdLayer.add(fruit.getName());
                    break;
            }
        }
        printMultiLayerFruitBowl();
    }

    public void printMultiLayerFruitBowl() {
        segregatedBowl.printFirstLayer(fruitsFirstLayer);
        segregatedBowl.printSecondLayer(fruitsSecondLayer);
        segregatedBowl.printThirdLayer(fruitsThirdLayer);
    }

}
