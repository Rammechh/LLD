package Designs.ParkingLotDesign.Stratagies.TimeBased;

import Designs.ParkingLotDesign.Models.Ticket;
import Designs.ParkingLotDesign.Stratagies.FeesStrategy;

public class SmallVehicleTimeStrategy implements FeesStrategy {

    @Override
    public Integer calculateFees(Ticket ticket) {
        return 0;
    }
}
