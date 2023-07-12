package main.java.Threads_ChangingCounter;

public class Client {
    public static void main(String[] args) throws InterruptedException{
        Counter c = new Counter(10);

        Adder a = new Adder(c);
        Subtractor s = new Subtractor(c);

        Thread t1 = new Thread(a);
        t1.start();

        Thread t2 = new Thread(s);
        t2.start();

        t1.join();
        t2.join();

        System.out.println("c.val is : "+c.getVal());



    }
}
