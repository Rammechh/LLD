package Designs.ParkingLotDesign.Stratagies;

import Designs.ParkingLotDesign.Models.Vehicle;
import Designs.ParkingLotDesign.Models.VehicleType;

public interface FeesCalculationFactory {
    public FeesStrategy getStrategy(VehicleType vehicleType);

}
