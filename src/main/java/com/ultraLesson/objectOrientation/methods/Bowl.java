package com.ultraLesson.objectOrientation.methods;

public class Bowl {
    public Bowl addMozzarellaCheese(){
        System.out.println("Added mozzarella cheese");
        return this;
    }
    public Bowl addOreganoSeeds(){
        System.out.println("Added oregano Seeds");
        return this;
    }
    public Bowl addToastedSesameSeeds(){
        System.out.println("Added toasted sesame seeds");
        return this;
    }
    public Bowl addCorianderLeaves(){
        System.out.println("Added coriander Leaves");
        return this;
    }
    public Bowl mix(){
        System.out.println("All materials are mixed");
        return this;
    }
    public Bowl spreadOnSheets(){
        System.out.println("Spread on sheet");
        return this;
    }
    public Bowl oilHeat(double temperature,int time){
        System.out.printf("%f Heat on medium temperature until became golden\n",temperature);
        return this;
    }
    private static class Cheeserakakat{}
    public Cheeserakakat serve() {
        System.out.println("Serving Cheese Rakakat");
        return new Cheeserakakat();
    }
    public static void main(String[] args){
        Bowl bowl= new Bowl();
        bowl.addMozzarellaCheese()
                .addOreganoSeeds()
                .addToastedSesameSeeds()
                .addCorianderLeaves()
                .mix()
                .spreadOnSheets()
                .oilHeat(100,30)
                .serve();
    }

}
