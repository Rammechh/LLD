package Designs.ParkingLotDesign.Services;

import Designs.ParkingLotDesign.Models.ParkingSpot;
import Designs.ParkingLotDesign.Repositories.ParkingSpotRepository;

public class ParkingSpotService {
    ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();

    public void markSlotBooked(ParkingSpot spot){
        parkingSpotRepository.save(spot);
    }
}
