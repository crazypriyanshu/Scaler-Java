package main.java.Consumer_Producer_Problem.V5;

public class Sparrow {
    private Flyator ref; // just a socket
    public void setFlyator(Flyator r) {
        ref = r;
    }
    void fly() {
        if (ref == null) {
            System.out.println(" No algorithm for flying....");
            return;
        }
        ref.flightAlgorith();
    }
}
