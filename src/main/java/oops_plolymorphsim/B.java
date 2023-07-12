package main.java.oops_plolymorphsim;

public class B extends A{
    private int d = 100;
    private int d2 = 200;

    public void fun() {
        // method over-riding - polymorphism
        System.out.println("Fun of B class which is extended from A");
    }

    public void fun2() {
        System.out.println("Fun2 of B class which is extended from A");
    }
}
