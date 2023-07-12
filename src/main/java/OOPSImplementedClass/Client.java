package main.java.OOPSImplementedClass;

public class Client {
    public static void main(String[] args) {
        A a = new A();
        a.d2 = 2000;
        a.d3 = 3000;
        a.d4 = 4000;

        System.out.println("d2 = "+ a.d2 + " d3 = "+ a.d3 + " d4 : "+a.d4);

    }
}
