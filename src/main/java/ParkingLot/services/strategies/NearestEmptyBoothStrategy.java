package main.java.ParkingLot.services.strategies;

import main.java.ParkingLot.models.Booth;
import main.java.ParkingLot.models.Gate;
import main.java.ParkingLot.models.ParkingLot;
import main.java.ParkingLot.models.enums.ParkingBoothStatus;
import main.java.ParkingLot.models.enums.VehicleType;
import main.java.ParkingLot.repositories.BoothRepository;
import main.java.ParkingLot.repositories.ParkingLotRepository;

import java.util.List;
import java.util.Optional;

public class NearestEmptyBoothStrategy implements BoothAllocationStrategy{
    private ParkingLotRepository parkingLotRepository;
    private BoothRepository boothRepository;

    public NearestEmptyBoothStrategy(ParkingLotRepository parkingLotRepository, BoothRepository boothRepository) {
        this.parkingLotRepository = parkingLotRepository;
        this.boothRepository = boothRepository;
    }

    @Override
    public Optional<Booth> assignBooth(VehicleType vehicleType, Gate gate) {
        ParkingLot parkingLot = parkingLotRepository.fetchByGateId(gate.getId());
        List<Booth> parkingBooths = boothRepository.fetchAllBoothsByParkingLot(parkingLot.getId());

        for (Booth booth: parkingBooths) {
            if (booth.getParkingBoothStatus().equals(ParkingBoothStatus.AVAILABLE) && booth.getSupportedVehicleType().equals(vehicleType)) {
                return Optional.of(booth);
            }
        }
        return Optional.empty();
    }
}
