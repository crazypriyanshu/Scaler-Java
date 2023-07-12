package main.java._Adder_Subtractor_lock;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    Counter c1;
    Lock lock;
    Adder(Counter c, Lock lock) {
        this.c1 = c;
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 0; i<= 10; i++) {
            lock.lock();
            c1.val += i;
            lock.unlock();
            System.out.println(c1.val + " - Coming from Adder");
        }
    }
}
