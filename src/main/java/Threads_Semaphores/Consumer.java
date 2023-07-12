package main.java.Threads_Semaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private String name;
    private Semaphore ps;
    private Semaphore cs;
    private Queue<Object> store;

    public Consumer(String name, Semaphore ps, Semaphore cs, Queue<Object> store) {
        this.name = name;
        this.cs = cs;
        this.ps = ps;
        this.store = store;
    }
    @Override
    public void run() {
        try {
            cs.acquire();
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        store.remove();
        System.out.println(name+ "removed the thread, store size is now : "+store.size());
        ps.release();

    }
}
