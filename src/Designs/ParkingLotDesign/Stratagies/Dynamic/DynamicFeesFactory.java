package Designs.ParkingLotDesign.Stratagies.Dynamic;

import Designs.ParkingLotDesign.Models.VehicleType;
import Designs.ParkingLotDesign.Stratagies.FeesCalculationFactory;
import Designs.ParkingLotDesign.Stratagies.FeesStrategy;
import Designs.ParkingLotDesign.Stratagies.TimeBased.LargeVehicleTimeStrategy;
import Designs.ParkingLotDesign.Stratagies.TimeBased.MediumVehicleTimeStrategy;
import Designs.ParkingLotDesign.Stratagies.TimeBased.SmallVehicleTimeStrategy;

public class DynamicFeesFactory implements FeesCalculationFactory {
    @Override
    public FeesStrategy getStrategy(VehicleType vehicleType) {
        switch (vehicleType){
            case LARGE:
                throw new RuntimeException("Not implemented");
            case MEDIUM:
                return new MediumVehicleDynamicStrategy();
            case SMALL:
                return new SmallVehicleDynamicStrategy();
        }
        throw new RuntimeException("Invalid vehicle type");
    }
}
