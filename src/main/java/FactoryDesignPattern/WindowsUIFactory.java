package main.java.FactoryDesignPattern;

public class WindowsUIFactory implements  UIFactory{
    public Button createButton() {
        return new WindowsButton();
    }

    public Menu createMenu() {
        return new WindowsMenu();
    }
}
