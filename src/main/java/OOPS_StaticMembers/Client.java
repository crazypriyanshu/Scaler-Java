package main.java.OOPS_StaticMembers;

public class Client {
    public static void main(String[] args) {
        A o1 = new A();
        o1.x = 10;
        o1.y = 20;

        A o2 = new A();
        o2.x = 100;
        o2.y = 200;

        o1.z = 20;

    }
}
