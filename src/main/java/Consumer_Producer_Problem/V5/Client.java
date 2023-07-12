package main.java.Consumer_Producer_Problem.V5;

public class Client {
    public static void main(String[] args) {
        Sparrow s = new Sparrow();
        s.fly();

        s.setFlyator(new SlowFlyator());
        s.fly();

        s.setFlyator(new FastFlyator());
        s.fly();

    }
}
