package main.java.FactoryDesignPattern;

public interface UIFactory {
//    This contains all the factory methods
    public Button createButton();

    public Menu createMenu();
}
