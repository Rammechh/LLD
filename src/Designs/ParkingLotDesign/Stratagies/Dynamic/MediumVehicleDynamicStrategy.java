package Designs.ParkingLotDesign.Stratagies.Dynamic;

import Designs.ParkingLotDesign.Models.Ticket;
import Designs.ParkingLotDesign.Stratagies.FeesStrategy;

public class MediumVehicleDynamicStrategy implements FeesStrategy {
    @Override
    public Integer calculateFees(Ticket ticket) {
        return 0;
    }
}
