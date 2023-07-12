package main.java.contest_Q3;

public class Client {
    public static void main(String[] args) {
        System.out.println(fun(2,3));

    }
    static int fun(int a, int b) {
        return a+b;
    }

    static int fun(int... arr) {
        System.out.println(" fun...arr");
        return 5;
    }
    static int fun(int a, int b, int c) {
        return a+b+c;
    }
    static String fun(String a, String b) {
        return a+b;
    }
//    static void fun(int a, int b) {
//
//    }
}
