package Designs.SnakeAndLadders.Services;


import Designs.SnakeAndLadders.Models.Dice;
import Designs.SnakeAndLadders.Models.GameRequest;
import Designs.SnakeAndLadders.Repositories.GameRepository;
import Designs.SnakeAndLadders.Models.*;

import java.util.ArrayList;
import java.util.List;

public class GameService {

    GameRepository gameRepository = new GameRepository();

    public Game createGame(GameRequest gameRequest) {
        Game game = initialiseGame(gameRequest);
        return gameRepository.save(game);
    }

    private Game initialiseGame(GameRequest gameRequest) {
        Board board = new Board(gameRequest.getBoardSize(), gameRequest.getSpecialCells());
        List<Player> players = gameRequest.getPlayers();
        List<Dice> dices = new ArrayList<>();
        return Game
                .builder()
                .board(board)
                .players(players)
                .dices(dices)
                .build();
    }

    public Game getGame(Integer gameId) {
        return gameRepository.findById(gameId);
    }

}
