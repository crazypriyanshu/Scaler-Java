package main.java.lambdas;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

public class DemoOnLambda {
    public static void main(String[] args) {
        BiPredicate<Integer, String> way1 = new DemoClassForBipredicate();

        BiPredicate<Integer, String> way2 = new BiPredicate<Integer, String>() {
            @Override
            public boolean test(Integer integer, String s) {
                return false;
            }
        };

        BiPredicate<Integer, String> way3 = (minLength, str) -> {
            return str.length() > minLength;
        };
        System.out.println(way3.test(5, "Chaluu"));

        BinaryOperator<String> o1 = (s1, s2) -> {
            return s1+s2;
        };
        System.out.println(o1.apply("hello", " Priyanshu"));

        BinaryOperator<String> o2 = (s1, s2) -> s1+" domma"+s2;

        System.out.println(o2.apply("China", " America"));

        BiConsumer<Integer, String> o3 = (num, str) -> {
            System.out.println(str);
            System.out.println(num);
        };

        o3.accept(5, "Chola Kingdom");

    }
}
