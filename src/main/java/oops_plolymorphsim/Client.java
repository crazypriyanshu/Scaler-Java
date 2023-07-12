package main.java.oops_plolymorphsim;

public class Client {
    public static void main(String[] args) {
        A o1 = new A();
        A o2 = new B();
        A o3 = new C();

//    B q1 = new A();

        B q2 = new B();

        o1.fun();
        o1.fun1();

        o2.fun();
        o2.fun1();
//        o2.fun2();    - this is not possible because ref is A
        o3.fun();   // has C's instance
        o3.fun1();


    }





}
