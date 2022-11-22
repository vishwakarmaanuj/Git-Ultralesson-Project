package com.ultraLesson.objectOrientation.aggregation;

public class Carrot extends Basket{
   private String color;
   private String taste;
   private String shape;

   public Carrot(String color, String taste,String shape) {
      this.color = color;
      this.taste = taste;
      this.shape = shape;
   }

   @Override
   public String toString() {
      return "Carrot{" +
              "color='" + color + '\'' +
              ", taste='" + taste + '\'' +
              ", shape='" + shape + '\'' +
              '}';
   }

   public void testTase(){
      System.out.println("Carrot is sweet");
   }

}
