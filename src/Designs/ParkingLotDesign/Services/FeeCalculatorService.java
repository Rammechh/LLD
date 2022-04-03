package Designs.ParkingLotDesign.Services;

import Designs.ParkingLotDesign.Models.Ticket;
import Designs.ParkingLotDesign.Stratagies.FeesCalculationFactory;
import Designs.ParkingLotDesign.Stratagies.FeesStrategy;
import Designs.ParkingLotDesign.Stratagies.FeesStrategyFactory;
import Designs.ParkingLotDesign.Stratagies.TimeBased.TimeBasedFeesStrategyFactory;

public class FeeCalculatorService {

    private static final String PRICING_SCHEME = "TimeBased";

    public int calculateFees(Ticket ticket) {

        FeesStrategy feesStrategy = FeesStrategyFactory
                .getFactory(PRICING_SCHEME)
                .getStrategy(ticket.getVehicleType());

        return feesStrategy.calculateFees(ticket);
    }

}
