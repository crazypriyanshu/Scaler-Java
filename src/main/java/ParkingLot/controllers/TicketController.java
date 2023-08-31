package main.java.ParkingLot.controllers;

import main.java.ParkingLot.dtos.GenerateTicketRequestDTO;
import main.java.ParkingLot.dtos.GenerateTicketResponseDTO;
import main.java.ParkingLot.dtos.ResponseStatus;
import main.java.ParkingLot.models.Ticket;
import main.java.ParkingLot.services.TicketService;

public class TicketController {
    private TicketService ticketService;
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    GenerateTicketResponseDTO generateTicket(GenerateTicketRequestDTO requestDTO) {
        GenerateTicketResponseDTO ticketResponseDTO = null;
        try {
            Ticket ticket = ticketService.generateTicket(requestDTO.getGateId(), requestDTO.getVehicleNumber(), requestDTO.getVehicleType());
//            ticketResponseDTO.setGeneratedTicketId(ticket.getId());
//            ticketResponseDTO.setStatus(ResponseStatus.SUCCESS);
//            ticketResponseDTO.setMessage("Ticket Generated Successfully");
        } catch (Exception ex) {
            ticketResponseDTO.setStatus(ResponseStatus.FAILURE);
            ticketResponseDTO.setMessage(ex.getMessage());
        }
        return ticketResponseDTO;
    }

}
