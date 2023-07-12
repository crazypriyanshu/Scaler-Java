package main.java.FunctionalInterface;

public class Client {
    public static void main(String[] args) {
        DemoInterface way1 = new DemoImplementation();
        way1.fun();

        DemoInterface way2 = new DemoInterface() {
            @Override
            public void fun() {
                System.out.println("anonnymous class way of implementing");
            }
        };
        way2.fun();

    }
}
