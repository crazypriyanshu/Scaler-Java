package main.java.DesignPatterns.Structural.DecoratorPattern.pizzaApp;

import java.util.ArrayList;

public class PizzaMargherita implements Pizza{
    ArrayList toppings = new ArrayList<String>();
    String name = "Margherita";

    public PizzaMargherita() {
        toppings.add("cheese");
        toppings.add("tomato");
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
