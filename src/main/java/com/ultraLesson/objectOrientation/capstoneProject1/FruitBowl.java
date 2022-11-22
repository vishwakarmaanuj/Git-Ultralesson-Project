package com.ultraLesson.objectOrientation.capstoneProject;

import java.util.ArrayList;
import java.util.List;

public class FruitBowl {
    private List<FruitLayer1> fruitLayer1List=new ArrayList<>();
    private List<FruitLayer2>fruitLayer2List=new ArrayList<>();
    private List<FruitLayer3>fruitLayer3List=new ArrayList<>();
    public void addFruits(FruitLayer1 fruitLayer1){
        this.fruitLayer1List.add(fruitLayer1);

    }
    public void addFruits(FruitLayer2 fruitLayer2){
        this.fruitLayer2List.add(fruitLayer2);

    }
    public void addFruits(FruitLayer3 fruitLayer3){
        this.fruitLayer3List.add(fruitLayer3);

    }
    public void show1(){
        for(int i=0;i<fruitLayer1List.size();i++){
            System.out.print(fruitLayer1List.get(i));
        }
    }
    public void show2(){
        for(int i=0;i<fruitLayer2List.size();i++){
            System.out.print(fruitLayer2List.get(i));
        }
    }
    public void show3(){
        for(int i=0;i<fruitLayer3List.size();i++){
            System.out.print(fruitLayer3List.get(i));
        }
    }

    public static void main(String[] args) {
        String kg="kg";
        FruitBowl fruitBowl=new FruitBowl();
        FruitBowlLayer1ForApple f1=new FruitBowlLayer1ForApple("apple","sweet","red",5.2);
        FruitBowlLayer2ForCherry f2=new FruitBowlLayer2ForCherry("cherry","red","sweet",2);
        FruitBowlLayer3ForOrange f3=new FruitBowlLayer3ForOrange("orange","yellow","sweet",2);
        fruitBowl.addFruits(f1);
        fruitBowl.show1();
        System.out.println();
        fruitBowl.addFruits(f2);
        fruitBowl.show2();
        System.out.println();
        fruitBowl.addFruits(f3);
        fruitBowl.show3();

    }

}
