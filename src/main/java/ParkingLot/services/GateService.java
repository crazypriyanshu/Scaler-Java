package main.java.ParkingLot.services;

import main.java.ParkingLot.exceptions.GateNotFoundException;
import main.java.ParkingLot.models.Gate;
import main.java.ParkingLot.repositories.GateRepository;

import java.util.Optional;

public class GateService {
    private GateRepository gateRepository;

    public GateService(GateRepository gateRepository) {
        this.gateRepository = gateRepository;
    }

    public Gate getGateById(Long gateId) throws GateNotFoundException {
        Optional<Gate> gateWrapper = gateRepository.fetchGateById(gateId);
        if (gateWrapper.isPresent()){
            return gateWrapper.get();
        }
        else {
            throw new GateNotFoundException();
        }

    }
}
