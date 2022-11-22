package com.ultraLesson.objectOrientation.methods;
public class SaucePan {
    public SaucePan adjustGasToveTemperature(String how) {
        System.out.println("heating oil in" + how);
        return this;
    }

    public SaucePan addOil(double quantity) {
        System.out.println("adding oil" + quantity);
        return this;
    }

    public SaucePan addOnion(double quantity) {
        System.out.printf("adding %f grams of onion%n", quantity);
        return this;
    }

    public SaucePan addLeek(double quantity) {
        System.out.printf("adding %f grams of onion\n", quantity);
        return this;
    }

    public SaucePan cookAndStir(double time) {
        System.out.printf("Heating for %f minutes\n", time);
        return this;
    }

    public SaucePan addGarlic(double quantity) {
        System.out.printf("adding %f grams of Garlic\n", quantity);
        return this;
    }

    public SaucePan addSpices(double quantity) {
        System.out.printf("adding %f grams of Spices\n", quantity);
        return this;
    }

    public SaucePan addPumpKin(double quantity) {
        System.out.printf("adding %f grams of PumpKin\n", quantity);
        return this;
    }

    public SaucePan addPotato(double quantity) {
        System.out.printf("adding %f grams of Potato\n", quantity);
        return this;
    }

    public SaucePan addSoup(double quantity) {
        System.out.printf("%f ml of Soup is added into the pan\n", quantity);
        return this;
    }
    public Soup serve() {
        System.out.println("Serving pumpkin soup");
        return new Soup();
    }
    private static class Soup {
    }



    public static void main(String[] args) {
        SaucePan saucePan = new SaucePan();
        saucePan.addOil(0.5)
                .adjustGasToveTemperature("low")
                .addOnion(100)
                .addLeek(200)
                .cookAndStir(2)
                .addGarlic(100)
                .addSpices(50)
                .cookAndStir(0.3)
                .addPumpKin(100)
                .addPotato(200)
                .adjustGasToveTemperature("boil")
                .cookAndStir(30)
                .adjustGasToveTemperature("low")
                .addSoup(1000)
                .cookAndStir(1)
                .serve();
    }

}
