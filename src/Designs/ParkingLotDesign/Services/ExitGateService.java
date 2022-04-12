package Designs.ParkingLotDesign.Services;

import Designs.ParkingLotDesign.Models.ParkingSpot;
import Designs.ParkingLotDesign.Models.SpotStatus;
import Designs.ParkingLotDesign.Models.Ticket;
import Designs.ParkingLotDesign.Models.VehicleType;
import Designs.ParkingLotDesign.Repositories.ParkingSpotRepository;
import Designs.ParkingLotDesign.Stratagies.FeesStrategy;
import Designs.ParkingLotDesign.dtos.GetTicketDTO;

public class ExitGateService {
    ParkingSpotService parkingSpotService = new ParkingSpotService();
    SpotAllocationService spotAllocationService = new SpotAllocationService();


    public void MarkSpotAvailable(Integer spotId) {
        ParkingSpot parkingSpot = spotAllocationService.removeSlot(spotId);
        parkingSpot.setSpotStatus(SpotStatus.AVAILABLE);
        parkingSpotService.markSlotAvailable(parkingSpot);
    }

//    public ParkingSpot PaymentCheck(Ticket ticket){
//
//    }
}

// 1. Implement exit gate
// 2. check payment
// 3. check price from ticket time
// 4. Mark Slot available