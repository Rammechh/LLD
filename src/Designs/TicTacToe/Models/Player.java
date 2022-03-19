package Designs.TicTacToe.Models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder(toBuilder = true)

public abstract class Player {
    GameSymbol symbol;
    abstract BoardCell makeMove(Board board);
}
