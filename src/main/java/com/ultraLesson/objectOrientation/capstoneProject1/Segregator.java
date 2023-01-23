package com.ultraLesson.objectOrientation.capstoneProject1;
import com.ultraLesson.objectOrientation.methods.Bowl;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;

public class Segregator {
    private List<Fruit>fruits;
    private MultiLayerFruitBowl multiLayerFruitBowl;
    public Segregator(List<Fruit> fruits, MultiLayerFruitBowl multiLayerFruitBowl){
        this.fruits=fruits;
        this.multiLayerFruitBowl=multiLayerFruitBowl;
    }
    public MultiLayerFruitBowl segregateByName() {
        fruits.forEach(fruit -> {
            addingInBowl(FruitPredicate.namePredicate(fruit), fruit);
        });
        return multiLayerFruitBowl;
    }
    private void addingInBowl(Predicate<Fruit>segregate,Fruit fruit){
        Optional<SmallFruitBowl> optionalBowl=multiLayerFruitBowl.getOptionalBowl((FruitPredicate<Fruit>) segregate);
        optionalBowl.ifPresent(bowl -> multiLayerFruitBowl.add(bowl,fruit));
    }


}
