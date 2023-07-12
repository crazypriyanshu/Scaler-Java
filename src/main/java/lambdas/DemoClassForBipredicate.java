package main.java.lambdas;

import java.util.function.BiPredicate;

public class DemoClassForBipredicate implements BiPredicate<Integer, String> {
    public boolean test(Integer integer, String s) {
        return false;
    }
}
