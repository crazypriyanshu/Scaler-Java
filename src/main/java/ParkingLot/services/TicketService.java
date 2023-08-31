package main.java.ParkingLot.services;

import main.java.ParkingLot.dtos.GenerateTicketRequestDTO;
import main.java.ParkingLot.exceptions.GateNotFoundException;
import main.java.ParkingLot.models.Gate;
import main.java.ParkingLot.models.Ticket;
import main.java.ParkingLot.models.Vehicle;
import main.java.ParkingLot.models.enums.VehicleType;
import main.java.ParkingLot.repositories.TicketRepository;

import java.util.Date;

public class TicketService {
    private TicketRepository ticketRepository;
    private GateService gateService;
    private VehicleService vehicleService;
    public TicketService(TicketRepository ticketRepository, GateService gateService, VehicleService vehicleService) {
        this.ticketRepository = ticketRepository;
        this.gateService = gateService;
        this.vehicleService = vehicleService;

    }
    public Ticket generateTicket(Long gateId, String vehicleNumber, VehicleType vehicleType) throws GateNotFoundException {

        // get the gate object => gateService

        Gate gate = gateService.getGateById(gateId);

        // get or register the vehicle => vehicleService
        Vehicle vehicle = vehicleService.getVehicle(vehicleNumber, vehicleType);
        // assign booth using appropriate strategy


        // create ticket object
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());
        ticket.setEntryGate(gate);
        ticket.setOperator(gate.getCurrentOperator());
        ticket.setVehicle(vehicle);
        ticket.setAssignedBooth(null);


        // save ticket object in db
        Ticket savedTicket = ticketRepository.save(ticket);
        return savedTicket;
    }
}
