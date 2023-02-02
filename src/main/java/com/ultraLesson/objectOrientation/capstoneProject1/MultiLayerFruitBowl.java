package com.ultraLesson.objectOrientation.capstoneProject1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class MultiLayerFruitBowl {
    private final List<SmallFruitBowl>  bowls = new ArrayList<>();
    //private int noOfLayers;
    public MultiLayerFruitBowl() {
        this(3);
    }
    public MultiLayerFruitBowl(int levels) {
        IntStream.range(0, levels)
                .forEach(level -> bowls.add(new SmallFruitBowl()));
    }

    public void printFirstLayer(List<String> firstLayer){
        System.out.println( firstLayer);
    }

    public void printSecondLayer(List<String> secondLayer){
        System.out.println(secondLayer);
    }

    public void printThirdLayer(List<String> thirdLayer){
        System.out.println(thirdLayer);
    }
}
