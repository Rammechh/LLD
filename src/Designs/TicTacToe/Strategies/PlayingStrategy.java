package Designs.TicTacToe.Strategies;

import Designs.TicTacToe.Models.Board;
import Designs.TicTacToe.Models.BoardCell;

public interface PlayingStrategy {

    public BoardCell play(Board board);
}
