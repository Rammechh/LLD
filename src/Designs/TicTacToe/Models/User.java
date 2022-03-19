package Designs.TicTacToe.Models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder(toBuilder = true)
public class User {
    private String userName;
    private String email;
    private String photo;
}
