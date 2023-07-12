package main.java.FactoryDesignPattern;

public class Flutter {

    // declare methods

    public void setTheme(){
        System.out.println("Setting theme");
    }

    public void setRefreshRate() {
        System.out.println(" Setting refresh rate");

    }


    public UIFactory createUIFactory(SupportedPlatforms platform) {
        // OCP is violated -> if-else condition, hence changing
//        if(platform.equals(SupportedPlatforms.ANDROID)) {
//            return new AndroidUIFactory();
//        }
//        else if (platform.equals(SupportedPlatforms.IOS)) {
//            return new IOSUIFactory();
//        } else if (platform.equals(SupportedPlatforms.WINDOWS)) {
//            return new WindowsUIFactory();
//        }
//        return null;
        // throwing my responsibility to create Factory to UIFactoryFactory class
        return UIFactoryFactory.createUIFactoryForGivenPlatform(platform);




    }
}
