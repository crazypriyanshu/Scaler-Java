package main.java.Threads_Semaphores;

import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private String name;
    private Semaphore ps;
    private Semaphore cs;
    private Queue<Object> store;

    public Producer(String name, Semaphore ps, Semaphore cs, Queue<Object> store) {
        this.name = name;
        this.cs = cs;
        this.ps = ps;
        this.store = store;
    }
    @Override
    public void run() {
        try {
            ps.acquire();
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        store.add(new Object());
        System.out.println(name + " added a shirt. Store size is now " + store.size());
        cs.release();
    }
}
