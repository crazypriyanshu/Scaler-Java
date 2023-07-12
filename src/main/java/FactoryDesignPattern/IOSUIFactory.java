package main.java.FactoryDesignPattern;

public class IOSUIFactory implements  UIFactory{
    public Button createButton() {

        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
