package main.java.DemoOnStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapAndFilterDemo {
    static class Car {
        int speed;
        int price;
        String brand;
        Car(int speed, int price, String brand) {
            this.speed = speed;
            this.price = price;
            this.brand = brand;
        }

        public String toString() {
            return "[ Speed = "+this.speed+" and price is: "+this.price+" And brand name is: "+this.brand+" ]\n";
        }
    }
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 5, 12, 17, 9, 99, 24, 48, 208);
        System.out.println(list);

        // now I want only even numbers from this list
        List<Integer> res = new ArrayList<>();
        for(int val: list){
            if (val%2 == 0){
                res.add(val);
            }
        };
        System.out.println(res);

        System.out.println(list.stream().filter(x -> x%2==0).toList());

        List<Car> cars = Arrays.asList(
                new Car(30, 300, "Suzuki"),
                new Car(50, 600, "Kia"),
                new Car(300, 1200, "Tata"),
                new Car(280, 3500, "Mercedes"),
                new Car(170, 1900, "Mahindra")
        );
        System.out.println(cars.stream().filter(c -> c.speed>150).toList());

        System.out.println((cars.stream().map(c -> c.price).toList()));
        System.out.println((cars.stream().map(c -> c.price>1000).toList()));


    }
}
