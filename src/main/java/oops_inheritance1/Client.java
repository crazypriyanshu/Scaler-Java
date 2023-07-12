package main.java.oops_inheritance1;

public class Client {
    public static void main(String[] args) {
//        P obj = new P();
//        System.out.println(obj.d1);
//        System.out.println(obj.d);
//        obj.fun1();
//        obj.fun();
//        obj.sfun();

        C obj = new C();
        System.out.println(obj.d1);
        System.out.println(obj.d);
        obj.fun1();
        obj.fun();
        obj.sfun();
    }
}
