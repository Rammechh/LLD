package Designs.ParkingLotDesign.Controllers;

import Designs.ParkingLotDesign.Models.VehicleType;
import Designs.ParkingLotDesign.Services.EntryGateService;
import Designs.ParkingLotDesign.dtos.GetTicketDTO;

public class EntryGateController {
    EntryGateService entryGateService = new EntryGateService();

    public GetTicketDTO createTicket(VehicleType vehicleType){
        return entryGateService.createTicket(vehicleType);
    }
}
