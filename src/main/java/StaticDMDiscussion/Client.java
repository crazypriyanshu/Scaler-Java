package main.java.StaticDMDiscussion;

public class Client {
    public static void main(String[] args) {
        A o1 = new A();
        o1.x = 10;
        o1.y = 20;
        A o2 = new A();
        o2.x = 100;
        o2.y = 200;

        o1.z = 100;
        System.out.println(o1.z + " " + o2.z + " " + A.z);
        o2.z = 200;
        System.out.println(o1.z + " " + o2.z + " " + A.z);
        A.z = 300;
        System.out.println(o1.z + " " + o2.z + " " + A.z);
    }
}
