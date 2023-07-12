package main.java.OOPS_ObjectModifiers;

public class Client {
    public static void main(String[] args) {
        B obj = new B();
//        obj.x = 10; // should not be allowed, x should be accessible to only B's methods.
        // Client class should be able to access x via B's methods only

        obj.setX(10);
        System.out.println(obj.getX());

        obj.setX(-10);
        System.out.println(obj.getX());

        obj.y = 100;
        System.out.println(obj.y);

        obj.z = 1000; // because client is in same folder
        System.out.println(obj.z);
    }
}
