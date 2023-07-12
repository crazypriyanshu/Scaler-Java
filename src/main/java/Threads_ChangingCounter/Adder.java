package main.java.Threads_ChangingCounter;

public class Adder implements Runnable{
    Counter c1;
    Adder(Counter c) {
        c1 = c;
    }

    @Override
    public void run() {
        for (int i=0; i< 10000; i++) {
            c1.incVal(i);
        }

    }
}
