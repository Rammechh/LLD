package Designs.SnakeAndLadders.Controllers;

import Designs.SnakeAndLadders.Models.Game;
import Designs.SnakeAndLadders.Models.GameRequest;
import Designs.SnakeAndLadders.Services.GameService;

public class GameController {

    private GameService gameService = new GameService();

    public Game createGame(GameRequest gameRequest) {
        return gameService.createGame(gameRequest);
    }

}
