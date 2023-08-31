package main.java.ParkingLot.services;

import main.java.ParkingLot.models.Vehicle;
import main.java.ParkingLot.models.enums.VehicleType;
import main.java.ParkingLot.repositories.VehicleRepository;

import java.util.Optional;

public class VehicleService {
    private VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }
    public Vehicle getVehicle(String vehicleNumber, VehicleType vehicleType) {
        Optional<Vehicle> vehicleWrapper = vehicleRepository.getVehicleById(vehicleNumber);

        if (vehicleWrapper.isEmpty()){
            // register a new vehicle
            Vehicle vehicle = new Vehicle();
            vehicle.setVehicleNumber(vehicleNumber);
            vehicle.setVehicleType(vehicleType);

            Vehicle savedVehicle = vehicleRepository.save(vehicle);
            return savedVehicle;
        }
        else {
            return vehicleWrapper.get();
        }
    }
}
