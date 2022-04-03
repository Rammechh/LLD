package Designs.ParkingLotDesign.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Payment {
    private String ticketId;
    private Integer amount;
    private String mode;
}
