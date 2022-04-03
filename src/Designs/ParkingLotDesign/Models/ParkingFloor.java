package Designs.ParkingLotDesign.Models;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor extends BaseModel{
    private Integer floorNumber;
    private String name;
    private List<ParkingSpot> parkingSpots = new ArrayList<>();
}
