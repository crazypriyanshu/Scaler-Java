package main.java.ParkingLot.exceptions;

public class GateNotFoundException extends Exception{
    public GateNotFoundException(){
        super("Gate with given ID not found");
    }
}
