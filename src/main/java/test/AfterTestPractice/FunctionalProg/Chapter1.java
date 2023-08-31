package main.java.test.AfterTestPractice.FunctionalProg;

import java.util.function.Function;

public class Chapter1 {
    protected static class MyMath {
        public static Integer myTriple(Integer x) {
            return 3*x;

        }
    }
    public static void main(String[] args) {
        Function<Integer, Integer> triple = MyMath::myTriple;
        Integer myTripleNum = triple.apply(5);
        System.out.println(myTripleNum);

        Function<Integer, Integer> myFunc = (Integer myVal) -> myVal*2+1;
        System.out.println(myFunc.apply(11));

        // can also be written without data type if output type is provided in Function<>
        Function<Integer, Integer> withoutDatatype = (myFuncVal) -> myFuncVal*5;
        System.out.println(withoutDatatype.apply(10));

        // can also write as below:
        Function<String, Integer> getStringLength = myValue -> myValue.length();
        System.out.println(getStringLength.apply("Chankyapuri"));

        // Multiline lambda functions
        Function<Integer, Integer> dubVal =
                (Integer x) -> {
            Integer res = x*2;
            return res;
        };
        System.out.println(dubVal.apply(12));

        // Absolute value example :
        Function<Integer, Integer> absoluteValue = (x) -> x < 0 ? -x : x;
        System.out.println(absoluteValue.apply(-4));


        // Using custom Functional methods
        TrieFunction<Integer, Integer, Integer, Integer> addThree = (x,y,z) -> x+y+z;
        System.out.println(addThree.apply(3, 5, 11));

        NoArgFunction<String> sayHello = () -> "Hello";
        System.out.println(sayHello.apply());

    }
}
