package Designs.SnakeAndLadders.Controllers;

import Designs.SnakeAndLadders.Services.BoardService;
import Designs.SnakeAndLadders.Models.Board;

public class BoardController {

    private BoardService boardService = new BoardService();

    public Board makeMove(Integer gameId, Integer playerId) {
        return boardService.makeMove(gameId, playerId);
    }
}
