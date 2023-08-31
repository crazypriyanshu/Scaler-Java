package main.java.test.AfterTestPractice.FunctionalProg;

public class ReturningFunctions {

    public static void main(String[] args) {
//        NoArgFunction<NoArgFunction<String>> createPrinter = () -> {
//            return () -> "Hello Functional ...";
//        };

        NoArgFunction<NoArgFunction<String>> createPrinter = () -> () -> "Hello Functional Programming ..";

        NoArgFunction<String> creator = createPrinter.apply();
        System.out.println(creator.apply());


    }
}
