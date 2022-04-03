package Designs.ParkingLotDesign.Stratagies;

import Designs.ParkingLotDesign.Models.Ticket;

public interface FeesStrategy {
    Integer calculateFees(Ticket ticket);
}
