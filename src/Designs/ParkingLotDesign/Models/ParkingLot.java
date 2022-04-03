package Designs.ParkingLotDesign.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ParkingLot extends BaseModel{
    private String address;
    private List<ParkingFloor> parkingFloors = new ArrayList<>();
    private  List<EntryGate> entryGates = new ArrayList<>();
    private List<ExitGate> exitGates = new ArrayList<>();
}
