package main.java.DesignPatterns.Structural.DecoratorPattern.pizzaApp;

import java.util.ArrayList;

public class PizzaHawaiian implements Pizza{
    static ArrayList toppings = new ArrayList<String>();
    static String name = "Hawaiian";

    public PizzaHawaiian() {
        toppings.add("cheese");
        toppings.add("tomato");
        toppings.add("basil");
        toppings.add("grilledChicken");
    }
    @Override
    public ArrayList getToppings() {
        return toppings;
    }



    @Override
    public String getName() {
        return name;
    }
}
