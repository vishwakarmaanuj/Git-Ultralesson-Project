package com.ultraLesson.objectOrientation.capstoneProject2;

public class OfferOnProduct {
        public void offerOnMilk(int liters) {
            if(liters >= 2) {
                int freeMilk = liters/2;
                System.out.println("You buy "+liters+" liters milk"+" and get "+freeMilk +" free");
            } else {
                System.out.println("Buy two  get one free");
            }
        }
}
