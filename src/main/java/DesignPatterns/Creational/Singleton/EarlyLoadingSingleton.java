package main.java.DesignPatterns.Creational.Singleton;

public class EarlyLoadingSingleton {
    private static EarlyLoadingSingleton earlyLoadingSingleton = new EarlyLoadingSingleton();
    private EarlyLoadingSingleton() {}

    public static EarlyLoadingSingleton getInstance() {
        return earlyLoadingSingleton;
    }
}
