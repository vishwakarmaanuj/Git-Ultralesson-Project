package com.ultraLesson.objectOrientation.methods;
public class Pan {
    public Pan adjustGasToveTemperature(String how) {
        System.out.println("heating oil in" + how);
        return this;
    }
    public Pan addItem(Item item){
        System.out.printf("Adding %s %s of %s\n",item.getQuantity(),item.getMetric(),item.getName());
        return this;
    }

    public Pan cookAndStir(double time) {
        System.out.printf("Heating for %f minutes\n", time);
        return this;
    }
    public Soup serve() {
        System.out.println("Serving pumpkin soup");
        return new Soup();
    }
    private static class Soup {
    }



    public static void main(String[] args) {
        String grams="grams";
        String ml="ml";
        Item onion=new Item("onion",100,grams);
        Item leek=new Item("leek",200,grams);
        Item garlic=new Item("garlic",100,grams);
        Item spices=new Item("spices",50,grams);
        Item pumpkin=new Item("pumpkin",100,grams);
        Item potato=new Item("potato",200,grams);
        Item soup=new Item("soup",50,ml);
        Item oil=new Item("oil",100,ml);
        Pan Pan = new Pan();
        Pan.addItem(oil)
                .adjustGasToveTemperature("low")
                .addItem(onion)
                .addItem(leek)
                .cookAndStir(2)
                .addItem(garlic)
                .addItem(spices)
                .cookAndStir(0.3)
                .addItem(pumpkin)
                .addItem(potato)
                .adjustGasToveTemperature("boil")
                .cookAndStir(30)
                .adjustGasToveTemperature("low")
                .addItem(soup)
                .cookAndStir(1)
                .serve();
    }

}
