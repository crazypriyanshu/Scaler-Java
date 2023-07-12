package main.java.Threads_AdderSubtractorProblem;

public class Subtracti implements  Runnable{
    Counter c2;

    Subtracti(Counter c){
        c2 = c;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 10000; i++){
            c2.val -= i;
        }
    }
}
