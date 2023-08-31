package main.java.ParkingLot.repositories;

import main.java.ParkingLot.models.Vehicle;

import java.util.HashMap;
import java.util.Optional;

public class VehicleRepository {
    private HashMap<Long, Vehicle> vehicleTableMock = new HashMap<>();
    private Long autoIncrementMock = 0L;

    public Vehicle save(Vehicle vehicle) {
        if (vehicle.getId() == Long.parseLong(null)) {
            autoIncrementMock++;
            vehicle.setId(autoIncrementMock);
            vehicleTableMock.put(vehicle.getId(), vehicle);
        }
        else {
            vehicleTableMock.put(vehicle.getId(), vehicle);
        }
        return vehicle;
    }

    public Optional<Vehicle> getVehicleById(String vehicleId) {
        if (vehicleTableMock.containsKey(vehicleId)) {
            return Optional.of(vehicleTableMock.get(vehicleId));
        }
        else {
            return Optional.empty();
        }

    }
}
