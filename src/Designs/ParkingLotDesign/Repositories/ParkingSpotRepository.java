package Designs.ParkingLotDesign.Repositories;

import Designs.ParkingLotDesign.Models.ParkingSpot;
import Designs.ParkingLotDesign.Models.SpotStatus;
import Designs.ParkingLotDesign.Models.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpotRepository {
    List<ParkingSpot> parkingSpots = new ArrayList<>();

    public ParkingSpot save(ParkingSpot parkingSpot){
        parkingSpots.add(parkingSpot);
        return parkingSpot;
    }

    public ParkingSpot findOneByVehicleTypeAndStatusAvailable(VehicleType type){
        for(ParkingSpot parkingSpot : parkingSpots){
            if (parkingSpot.getSpotStatus() == SpotStatus.AVAILABLE && parkingSpot.getVehicleType() == type){
                return parkingSpot;
            }
        }
        return null;
    }

}
