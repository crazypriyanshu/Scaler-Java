package main.java.DesignPatterns.Creational.Singleton;

public class DoubleCheckSingleton {
    private static DoubleCheckSingleton doubleCheckSingleton = null;
    private DoubleCheckSingleton() {}

    public static DoubleCheckSingleton getInstance() {
        if (doubleCheckSingleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (doubleCheckSingleton == null) {
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }
}
