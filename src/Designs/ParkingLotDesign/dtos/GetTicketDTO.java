package Designs.ParkingLotDesign.dtos;

import Designs.ParkingLotDesign.Models.ParkingSpot;
import Designs.ParkingLotDesign.Models.VehicleType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder(toBuilder = true)
public class GetTicketDTO {
    private VehicleType vehicleType;
    private LocalDateTime entryTime;
}
