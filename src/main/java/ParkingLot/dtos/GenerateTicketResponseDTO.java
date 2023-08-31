package main.java.ParkingLot.dtos;

public class GenerateTicketResponseDTO {
    private long generatedTicketId;
    private String message;
    private ResponseStatus status;

    public long getGeneratedTicketId() {
        return generatedTicketId;
    }

    public void setGeneratedTicketId(long generatedTicketId) {
        this.generatedTicketId = generatedTicketId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }
}
