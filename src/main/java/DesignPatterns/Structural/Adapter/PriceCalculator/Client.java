package main.java.DesignPatterns.Adapter.PriceCalculator;

public class Client {
    public static void main(String[] args) {
        CarPriceCalculator carPriceCalculator = new CarPriceCalculator("Ford", 20);
        printVehiclePrice(carPriceCalculator);

        TruckPriceCalculator truckPriceCalculator = new TruckPriceCalculator(11, 7);
        printVehiclePrice(truckPriceCalculator);

        UKCarPriceCalculator ukCarPriceCalCulator = new UKCarPriceCalculator("BMW", 7);



    }

    public static void printVehiclePrice(PriceCalculator calculator) {
        String price = calculator.calculatePrice();
        System.out.println(" Price of vehicle is "+ price);

    }
}
