package Designs.SnakeAndLadders.Models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private Integer id;
    private String username;
    private String email;
}
