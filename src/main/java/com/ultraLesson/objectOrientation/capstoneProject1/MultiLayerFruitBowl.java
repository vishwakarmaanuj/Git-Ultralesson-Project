package com.ultraLesson.objectOrientation.capstoneProject1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class MultiLayerFruitBowl {
    private  Map<Integer,List<Fruit>>fruitCollection=new HashMap<>();
    //private int noOfLayers;
    public MultiLayerFruitBowl() {
        this(3);
        createLayers(3);

    }
    public MultiLayerFruitBowl(int levels) {
       createLayers(levels);
    }
public void printFruitsInTheLayer(int level){
    System.out.print("Fruits in the level "+ level+":");
    fruitCollection.get(level).forEach(fruit -> {

        System.out.print(fruit.getName()+" " );
    });
    System.out.println();
}
    public void addItems(int level,Fruit fruit){
        List<Fruit>fruits=fruitCollection.get(level);
        fruits.add(fruit);
        fruitCollection.put(level,fruits);
    }
    private void createLayers(int layers){
        for(int i=0;i<layers;i++){
            fruitCollection.put(i,new ArrayList<>());
        }
    }

}
