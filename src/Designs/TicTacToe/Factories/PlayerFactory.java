package Designs.TicTacToe.Factories;

import Designs.TicTacToe.Models.Bot;
import Designs.TicTacToe.Models.HumanPlayer;

public class PlayerFactory {

//
    public static HumanPlayer.HumanPlayerBuilder getHumanPlayer(){
        return HumanPlayer
                .builder();
    }
    public static Bot.BotBuilder getBotPlayer(){
        return Bot
                .builder();
    }
}
