package main.java.Threads_SynochonizedBlock;

public class Adder implements Runnable{
    Counter c1;
    Adder(Counter c) {
        c1 = c;
    }

    @Override
    public void run() {
        for (int i = 0; i< 10000; i++) {
            synchronized (c1){
                c1.val += i;
            }
        }
    }
}
