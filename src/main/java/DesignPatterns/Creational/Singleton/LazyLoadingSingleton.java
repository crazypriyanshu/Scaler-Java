package main.java.DesignPatterns.Creational.Singleton;

public class LazyLoadingSingleton {
    private static LazyLoadingSingleton lazyLoadingSingleton = null;
    private LazyLoadingSingleton() {}

    public static synchronized LazyLoadingSingleton getInstance() {
        if (lazyLoadingSingleton == null) {
            lazyLoadingSingleton = new LazyLoadingSingleton();
        }
        return lazyLoadingSingleton;
    }

}
