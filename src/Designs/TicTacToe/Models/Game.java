package Designs.TicTacToe.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Game {
    private Board board;

    private List<Player> players = new ArrayList<>();

    public static Builder getBuilder(){
        return new Builder();
    }



    public static class Builder {
        private Game game;

        public Builder(){
            this.game = new Game();
        }

        public Builder withDimensions(int rows, int columns){
            Board board = new Board(rows, columns);
            this.game.setBoard(board);
            return this;
        }

        public Builder withPlayers(Player player){
            game.getPlayers().add(player);
            return this;
        }

        private boolean validate(){
            List<Player> players = game.getPlayers();
            if (players.size() > 2){
                return false;
            }
            return true;
        }

        public Game build(){
            boolean isValid = validate();
            if (!isValid){
                throw new RuntimeException("Game is not valid");
            }
            return this.game;
        }
    }
}
