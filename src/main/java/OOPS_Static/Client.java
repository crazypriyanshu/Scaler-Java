package main.java.OOPS_Static;
import main.java.OOPS_ObjectModifiers.B;
public class Client {
    public static void main(String[] args) {
        A.sfun();

        B obj = new B();
//        obj.x = 10; // not allowed, because x is private
        obj.y = 100; // allowed, because y is public
//        obj.z = 1000; // can't use because z is package private i.e. visible in its folder only
    }
}
