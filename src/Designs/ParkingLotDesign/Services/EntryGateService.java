package Designs.ParkingLotDesign.Services;

import Designs.ParkingLotDesign.Models.ParkingSpot;
import Designs.ParkingLotDesign.Models.SpotStatus;
import Designs.ParkingLotDesign.Models.Ticket;
import Designs.ParkingLotDesign.Models.VehicleType;
import Designs.ParkingLotDesign.dtos.GetTicketDTO;

public class EntryGateService {

    ParkingSpotService parkingSpotService = new ParkingSpotService();
    SpotAllocationService spotAllocationService = new SpotAllocationService();
    TicketService ticketService = new TicketService();

    public GetTicketDTO createTicket(VehicleType vehicleType) {

        // Early returns
        ParkingSpot parkingSpot = spotAllocationService.allocateSlot(vehicleType);
        if (parkingSpot == null) {
            throw new RuntimeException("Slot not available!");
        }

        // Update parking spot
        parkingSpot.setSpotStatus(SpotStatus.FILLED);
        parkingSpotService.markSlotBooked(parkingSpot);

        // Create and persist ticket
        Ticket ticket = ticketService.createTicket(vehicleType, parkingSpot);

        // Transform ticket to DTO and return
        return GetTicketDTO
                .builder()
                .entryTime(ticket.getEntryTime())
                .vehicleType(ticket.getVehicleType())
                .build();
    }
}

// 1. Find available spot
// 2. update the available spot(mark it Filled)
// 3. Create a new ticket
// 4. Transform ticket to DTO and return
