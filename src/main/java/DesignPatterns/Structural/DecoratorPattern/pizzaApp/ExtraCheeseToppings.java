package main.java.DesignPatterns.Structural.DecoratorPattern.pizzaApp;

import java.util.ArrayList;

public class ExtraCheeseToppings implements Pizza{
    ArrayList toppings;
    Pizza pizza;
    public ExtraCheeseToppings(Pizza pizza) {
        this.pizza = pizza;
        toppings = pizza.getToppings();
        toppings.add("Cheese(extra)");
    }


    @Override
    public ArrayList getToppings() {
        return toppings;
    }


    @Override
    public String getName() {
        return pizza.getName();
    }
}
