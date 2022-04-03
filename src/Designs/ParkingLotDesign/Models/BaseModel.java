package Designs.ParkingLotDesign.Models;

import lombok.Data;

import java.sql.Date;


//@Data
public class BaseModel {
    private long id;
    private Date createdAt;
    private Date updatedAt;
}
