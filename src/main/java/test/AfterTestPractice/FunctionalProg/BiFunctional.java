package main.java.test.AfterTestPractice.FunctionalProg;
import java.util.function.BiFunction;
public class BiFunctional {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (x, y) -> x+y;
        System.out.println(add.apply(3, 4));

    }
}
