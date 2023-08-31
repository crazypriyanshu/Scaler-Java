package main.java.test.AfterTestPractice.FunctionalProg;

import java.util.function.BiFunction;

public class PassingFunctionAsArgument {
    public static class MyMath {
        public static Integer add(Integer x, Integer y)  {
            return x+y;
        }

        public static Integer sub(Integer x, Integer y)  {
            return x-y;
        }

        // Passing functions as an argument
        public static Integer combine2And3(BiFunction<Integer, Integer,Integer> combineFunc) {
            return combineFunc.apply(2,3);
        }
    }
    public static void main(String[] args) {
        System.out.println(MyMath.combine2And3(MyMath::add));
        System.out.println(MyMath.combine2And3(MyMath::sub));
        System.out.println(MyMath.combine2And3((x, y) -> 2*x + 3*y));

    }
}
