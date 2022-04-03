package Designs.TicTacToe.Models;

import Designs.TicTacToe.Strategies.PlayingStrategy;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder(toBuilder = true)
public class Bot extends Player{

    private PlayingStrategy playingStrategy;

    @Override
    public BoardCell makeMove(Board board) {
        return playingStrategy.play(board);
    }

}
