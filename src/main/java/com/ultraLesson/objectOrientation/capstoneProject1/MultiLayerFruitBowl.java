package com.ultraLesson.objectOrientation.capstoneProject1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MultiLayerFruitBowl {
    private List<SmallFruitBowl>bowls;
    private int noOfLayers;
    public MultiLayerFruitBowl(int noOfLayers,int bowlValue){
        this.noOfLayers=noOfLayers;
        this.bowls=new ArrayList<>();
       // FruitBowl(noOfLayers);
    }
    public void add(SmallFruitBowl bowl, Fruit fruit) {
        bowl.addFruit(fruit);
    }
    @Override
    public String toString() {
        return "{"
                + "\"bowls\":" + bowls
                + "}";
    }

    public Optional<SmallFruitBowl> getOptionalBowl(FruitPredicate<Fruit> fruitPredicate) {
        return bowls.stream().filter(bowl -> bowl
                .getFruits()
                .stream()
                .allMatch(fruitPredicate)).findFirst();
    }
}
