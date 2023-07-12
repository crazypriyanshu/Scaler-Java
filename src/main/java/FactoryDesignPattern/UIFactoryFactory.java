package main.java.FactoryDesignPattern;

public class UIFactoryFactory {
    // only one responsibility - to create a factory
    // just add if-else and add a new platform in code
    // Practical Factory...
    public static UIFactory createUIFactoryForGivenPlatform(SupportedPlatforms platforms) {
        if (platforms.equals(SupportedPlatforms.ANDROID)) {
            return new AndroidUIFactory();
        } else if (platforms.equals(SupportedPlatforms.IOS)) {
            return new IOSUIFactory();

        }
        else if (platforms.equals(SupportedPlatforms.WINDOWS)) {
            return new WindowsUIFactory();
        }
        return null;
    }
}
