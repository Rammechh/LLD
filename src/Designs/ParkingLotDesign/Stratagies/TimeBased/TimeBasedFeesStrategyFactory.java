package Designs.ParkingLotDesign.Stratagies.TimeBased;

import Designs.ParkingLotDesign.Models.VehicleType;
import Designs.ParkingLotDesign.Stratagies.FeesCalculationFactory;
import Designs.ParkingLotDesign.Stratagies.FeesStrategy;

public class TimeBasedFeesStrategyFactory implements FeesCalculationFactory {

    public FeesStrategy getStrategy(VehicleType vehicleType){
        switch (vehicleType){
            case LARGE:
                return new LargeVehicleTimeStrategy();
            case MEDIUM:
                return new MediumVehicleTimeStrategy();
            case SMALL:
                return new SmallVehicleTimeStrategy();
        }
        throw new RuntimeException("Invalid vehicle type");
    }

}
