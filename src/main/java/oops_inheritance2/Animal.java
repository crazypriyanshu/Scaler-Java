package main.java.oops_inheritance2;

public class Animal {
    protected String name;
    protected int d1 = 10;

    public Animal(String name) {
        this.name = name;
    }
    public void eat() {
        System.out.println(name+ " is eating");
    }
}
