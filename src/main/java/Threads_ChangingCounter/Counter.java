package main.java.Threads_ChangingCounter;

public class Counter {
    private int val = 0;

    Counter(int val) {
        this.val = val;
    }

    public synchronized void incVal(int offset){
        val += offset;
    }

    public synchronized int getVal() {
        return val;
    }
}
