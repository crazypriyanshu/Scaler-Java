package main.java.ParkingLot.services.strategies;

import main.java.ParkingLot.models.Booth;
import main.java.ParkingLot.models.Gate;
import main.java.ParkingLot.models.enums.VehicleType;

import java.util.Optional;

public interface BoothAllocationStrategy {
    Optional<Booth> assignBooth(VehicleType vehicleType, Gate gate);
}
