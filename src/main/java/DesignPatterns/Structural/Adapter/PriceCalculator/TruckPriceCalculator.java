package main.java.DesignPatterns.Adapter.PriceCalculator;

public class TruckPriceCalculator implements PriceCalculator {
    private int age;
    private int mileage;
    public static int avgPrice = 10000;

    public TruckPriceCalculator(int age, int mileage) {
        this.age = age;
        this.mileage = mileage;

    }

    @Override
    public String calculatePrice() {
        int price = Math.max(avgPrice - age*10 - mileage/100, 0);
        return price+" USD";
    }
}
