package main.java.FactoryDesignPattern;

public class AndroidUIFactory implements  UIFactory{
    public Button createButton() {
        return new AndroidButton();
    }

    public Menu createMenu() {
        return new AndroidMenu();
    }
}
