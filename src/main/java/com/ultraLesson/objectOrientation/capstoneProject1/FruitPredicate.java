package com.ultraLesson.objectOrientation.capstoneProject1;

import java.util.function.Predicate;

public abstract class FruitPredicate<F> implements Predicate<Fruit> {
    public static Predicate<Fruit> namePredicate(Fruit fruit) {
        return f -> f.getName().equalsIgnoreCase(fruit.getName());
    }
}
