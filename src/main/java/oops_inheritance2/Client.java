package main.java.oops_inheritance2;

public class Client {
    public static void main(String[] args) {
        Cat c = new Cat("Tom");
        c.eat();
        c.meaon();
        c.eat("Chawal");
        System.out.println(c.d2); //20
        System.out.println(c.d1); // 200

        Animal animal = new Cat("Pussy Baby");
        animal.eat();
        System.out.println(animal.d1); // 10

    }
}
