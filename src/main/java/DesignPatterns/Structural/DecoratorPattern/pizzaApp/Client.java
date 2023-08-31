package main.java.DesignPatterns.Structural.DecoratorPattern.pizzaApp;

public class Client {
    public static void main(String[] args) {
        order(new PizzaHawaiian());
        order(new PizzaPepperoni());
        order(new ExtraCheeseToppings(new PizzaMargherita()));

    }

    public static void order(Pizza pizza) {
        System.out.println("You have ordered a "+ pizza.getName() + " and the toppings are "+ pizza.getToppings()+ " Thank you for ordering...");
    }
}
