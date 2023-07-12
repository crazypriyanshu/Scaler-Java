package main.java.StaticMethods;

public class A {
    void fun(){
        System.out.println("Can be called only via an object, because it is not static");
    }

    static void sfun(){
        System.out.println("I am static. I can be called directly via class name");
    }


}
