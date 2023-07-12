package main.java.StaticMethods;

import java.util.Arrays;

public class Client {

    public static void main(String[] args) {
        System.out.println(Math.abs(-10));

        int[] arr = {10, 20, 2, 45, 1, 13};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        A obj = new A();
        obj.fun();
//        A.fun();
        obj.sfun();
        A.sfun();
    }
}