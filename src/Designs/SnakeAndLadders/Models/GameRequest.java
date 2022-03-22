package Designs.SnakeAndLadders.Models;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder(toBuilder = true)
public class GameRequest {
    private Integer boardSize;

    @Builder.Default
    List<Player> players = new ArrayList<>();

    @Builder.Default
    List<Dice> dices = new ArrayList<>();

    @Builder.Default
    List<Cell> specialCells = new ArrayList<>();
}
