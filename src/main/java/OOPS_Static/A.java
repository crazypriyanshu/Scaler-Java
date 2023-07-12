package main.java.OOPS_Static;

public class A {
    int x; // instance level
    static int y; // class level

    // a instance level method
    void fun(){

    }

    // a class level method
    static void sfun(){
        // can we use x here? -> no, because x is alive in objects only and
        // this method can be called without making an object
//        x = 10;
        System.out.println(y);
    }
}
