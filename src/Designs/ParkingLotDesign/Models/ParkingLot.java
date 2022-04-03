package Designs.ParkingLotDesign.Models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ParkingLot {
    private String address;
    private List<ParkingFloor> parkingFloors = new ArrayList<>();
    private  List<EntryGate> entryGates = new ArrayList<>();
    private List<ExitGate> exitGates = new ArrayList<>();
}
