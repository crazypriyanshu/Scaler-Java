package main.java.Threads_Semaphores;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Queue<Object> store = new LinkedList<>();
        int cap = 5;
        Semaphore ps = new Semaphore(5);
        Semaphore cs = new Semaphore(0);

        for(int i =0; i< 10; i++) {
            Producer p = new Producer("p"+i,ps, cs, store);
            Thread tfp = new Thread(p);
            tfp.start();

            Consumer c = new Consumer("c"+i,ps, cs, store);
            Thread tfc = new Thread(c);
            tfc.start();
        }
    }
}
