package com.ultraLesson.objectOrientation.capstoneProject2;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
    private ArrayList<Item> cart = new ArrayList<>();
    private double price;

    public ShoppingCart() {
        cart = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        cart.add(item);
    }

    public double calculateTotalPrice() {
        for (int i = 0; i < cart.size(); i++) {
            double tot = cart.get(i).getTotalPrice();
            if (cart.get(i).getTotalPrice() >= 100) {
                double pric = tot - tot * 5 / 100;
                tot = pric;

            }
            price = price + tot;
        }
        return price;
    }
public void purchase(){
    System.out.println("The total price of items are : "+price);
    Scanner sc=new Scanner(System.in);
    System.out.println("Do you want to purchases the items");
    String string= sc.nextLine();
    switch (string) {
        case "yes":
            System.out.println("Items purchased");
            System.out.println("paid by e-wallets");
            break;
        default:
            System.out.println("Invalid");
            break;

    }
}
//    public void Ewallet() {
//        System.out.println("paid by e-wallets");
//    }

   public void show() {
        for (int i = 0; i < cart.size(); i++) {
            System.out.println(cart.get(i));
        }
    }
}
