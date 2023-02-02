package com.ultraLesson.objectOrientation.capstoneProject1;

import java.util.ArrayList;
import java.util.List;
public class Segregator {
    private final FruitBowl frtBowl;
    private final MultiLayerFruitBowl segregatedBowl;

    public Segregator(FruitBowl mixedBowl, MultiLayerFruitBowl emptyLayerBowl) {
        this.frtBowl = mixedBowl;
        this.segregatedBowl = emptyLayerBowl;
    }

    public void segregateByColor() {
        System.out.println("Fruits Segregated by Color: ");
        for (Fruit fruit : frtBowl.getFruits()) {
            switch (fruit.getColor()) {
                case "red":
                    segregatedBowl.addItems(0,fruit);
                    break;
                case "green":
                    segregatedBowl.addItems(1,fruit);
                    break;
                case "orange":
                    segregatedBowl.addItems(2,fruit);
                    break;
                default:
                    System.out.println(fruit.getName()+"Does not belong to any level");
            }
        }
        printMultiLayerFruitBowl();
    }

    public void printMultiLayerFruitBowl() {
        segregatedBowl.printFruitsInTheLayer(0);
        segregatedBowl.printFruitsInTheLayer(1);
        segregatedBowl.printFruitsInTheLayer(2);
    }

}
