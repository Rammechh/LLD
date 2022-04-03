package Designs.ParkingLotDesign.Stratagies;

import Designs.ParkingLotDesign.Stratagies.Dynamic.DynamicFeesFactory;
import Designs.ParkingLotDesign.Stratagies.TimeBased.TimeBasedFeesStrategyFactory;

public class FeesStrategyFactory {
    public static FeesCalculationFactory getFactory(String pricingScheme){

        switch(pricingScheme) {
            case "TimeBased":
                return new TimeBasedFeesStrategyFactory();
            case "Dynamic":
                return new DynamicFeesFactory();
        }

        throw new RuntimeException();
    }
}
