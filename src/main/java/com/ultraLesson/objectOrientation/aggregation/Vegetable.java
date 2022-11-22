package com.ultraLesson.objectOrientation.aggregation;

import java.util.ArrayList;
import java.util.List;

public class Vegetable {
    private List<Basket> basketList = new ArrayList<>();

    public void addSpecies(Basket basket) {
        this.basketList.add(basket);
    }

    public void show() {
        for (int i = 0; i < basketList.size(); i++) {
            System.out.println(basketList.get(i));
        }
    }
    public static void main(String[] args) {
        Vegetable vegetable = new Vegetable();
        Tomato tomato = new Tomato("red", "sweet", "cylindrical");
        Carrot carrot = new Carrot("red", "sweet", "cylindrical");
        Brinjal brinjal = new Brinjal("black", "cylindrical", "tastless");
        Radish radish = new Radish("white", "bitter", "cylindrical");
        vegetable.addSpecies(tomato);
        vegetable.show();
        vegetable.basketList.clear();
        vegetable.addSpecies(carrot);
        vegetable.show();
        vegetable.basketList.clear();
        vegetable.addSpecies(brinjal);
        vegetable.show();
        vegetable.basketList.clear();
        vegetable.addSpecies(radish);
        vegetable.show();


    }
}
