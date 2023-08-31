package main.java.DesignPatterns.Structural.CompositePattern.ex1;

public class Manager implements Payee {
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void payExpenses(int amount) {
        System.out.println(name + " has been paid $ "+ amount + " amount.");

    }
}
