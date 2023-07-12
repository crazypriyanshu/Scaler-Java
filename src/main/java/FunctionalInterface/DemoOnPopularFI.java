package main.java.FunctionalInterface;

import java.util.function.*;
public class DemoOnPopularFI {
    public static void main(String[] args) {

        Consumer<Integer> consumerObj = new Consumer<Integer>() {
            public void accept(Integer integer) {

            }
        };

        BiConsumer<String, Integer> biConsumerObj = new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {

            }
        };

        Predicate<Integer> predicateObj = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return false;
            }
        };

        BiPredicate<Integer, String> biPredicateObj = new BiPredicate<Integer, String>() {
            @Override
            public boolean test(Integer integer, String s) {
                return false;
            }
        };

        Function<Integer, String> functionObj = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return null;
            }
        };

        BiFunction<Integer, String, Double> biFunctionObj = new BiFunction<Integer, String, Double>() {
            @Override
            public Double apply(Integer integer, String s) {
                return null;
            }
        };

        BinaryOperator<Integer> binaryOperatorObj = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return null;
            }
        };

    }
}
