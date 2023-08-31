package main.java.DesignPatterns.Adapter.PriceCalculator;

public class CarPriceCalculator implements PriceCalculator{
    private int age;
    private String model;
    private static int avgPrice = 6000;

    public CarPriceCalculator(String model, int age) {
        this.model = model;
        this.age = age;
    }

    public int getRetailPrice(){
        switch (model){
            case "Ford":
                return 3000;
            case "BMW":
                return 8000;
            case "Tata":
                return 6000;
            default:
                return avgPrice;
        }

    }

    @Override
    public String calculatePrice() {
        int price = Math.max(getRetailPrice(),0);
        return price+" USD";
    }
}
