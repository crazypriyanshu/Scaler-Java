package main.java.Threads_ChangingCounter;

public class Subtractor implements Runnable{
    Counter c2;
    Subtractor(Counter c) {
        c2 = c;
    }

    @Override
    public void run() {
        for (int i=0; i< 10000; i++)
                c2.incVal(-i);
        }
    }

