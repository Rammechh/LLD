package Designs.ParkingLotDesign.Services;

import Designs.ParkingLotDesign.Models.ParkingSpot;
import Designs.ParkingLotDesign.Models.Ticket;
import Designs.ParkingLotDesign.Models.VehicleType;
import Designs.ParkingLotDesign.Repositories.TicketRepository;

import java.time.LocalDateTime;

public class TicketService {
    private TicketRepository ticketRepository = new TicketRepository();

    public Ticket createTicket(VehicleType vehicleType, ParkingSpot spot) {

        Ticket ticket = Ticket
                .builder()
                .entryTime(LocalDateTime.now())
                .floorNumber(spot.getFloorNumber())
                .slotNumber(spot.getSpotId())
                .build();

        return ticketRepository.save(ticket);
    }
}
