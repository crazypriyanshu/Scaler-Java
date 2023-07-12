package main.java.BuilderDesignPattern;

public class Shop {
    public static void main(String[] args) {
        Phone p = new PhoneBuilder()
                .setOs("Android")
                .setRam(2)
                .setProcessor("Intel")
                .getPhone();
        System.out.println(p);

    }
}
