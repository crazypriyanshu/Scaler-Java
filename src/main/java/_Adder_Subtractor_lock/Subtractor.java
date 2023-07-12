package main.java._Adder_Subtractor_lock;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{
    Counter c2;
    Lock lock;
    Subtractor(Counter c, Lock lock) {
        this.lock = lock;
        this.c2 = c;
    }

    @Override
    public void run() {

        for (int i =0; i<= 10; i++)
        {
            lock.lock();
            c2.val += i;
            lock.unlock();
            System.out.println(c2.val + " - Subtractor");
        }


    }
}
