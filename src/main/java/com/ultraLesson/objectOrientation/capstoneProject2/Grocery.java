package com.ultraLesson.objectOrientation.capstoneProject2;

public class Grocery {

    public static void main(String[] args) {
        ShoppingCart shoppingCart=new ShoppingCart();
        Item apple=new Item("apple",3,"kashmiri", 2);
        Item milk=new Item("milk",105,"Amul", 2);
        Item newspaper = new Item("newspaper",3,"Amarujala", 1);
        shoppingCart.addItem(apple);
        //shoppingCart.calculateTotalPrice();
        shoppingCart.addItem(milk);
        //shoppingCart.calculateTotalPrice();
        shoppingCart.addItem(newspaper);
        shoppingCart.show();
        System.out.println("The total price of selected items in cart are : "+shoppingCart.calculateTotalPrice());
        shoppingCart.purchase();
        shoppingCart.buyOneGetOne();

        //shoppingCart.Ewallet();
    }
}
