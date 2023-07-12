package main.java.FactoryDesignPattern;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();

      // We just need to pass the value of type and no need to change any extra code

        UIFactory uiFactory = flutter.createUIFactory(SupportedPlatforms.ANDROID);

        // uiFactory -> Android Factory

        Button button = uiFactory.createButton();
        button.showButton();

        Menu menu = uiFactory.createMenu();
        menu.showMenu();
        flutter.setTheme();
        flutter.setRefreshRate();

    }
}
