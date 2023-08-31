package main.java.ParkingLot.repositories;

import main.java.ParkingLot.models.Ticket;

import java.util.HashMap;

public class TicketRepository {
    private HashMap<Long, Ticket> ticketTableMock = new HashMap<>();
    private Long autoIncrementMock = 0L;

    public Ticket save(Ticket ticket) {
        if (ticket.getId() == Long.parseLong(null)) {
            autoIncrementMock++;
            ticket.setId(autoIncrementMock);
            ticketTableMock.put(ticket.getId(), ticket);
        }
        else {
            ticketTableMock.put(ticket.getId(), ticket);
        }
        return ticket;
    }
}
