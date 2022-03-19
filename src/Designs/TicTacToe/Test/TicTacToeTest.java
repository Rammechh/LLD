package Designs.TicTacToe.Test;

import Designs.TicTacToe.Models.*;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static Designs.TicTacToe.Models.GameSymbol.*;
import static org.junit.Assert.assertEquals;

//public class TicTacToeTest {
//    private Game game;
//    @Before
//    public void setUp() {
//        this.game = createGame();
//    }
//
//    public Game createGame(){
//        Game game = new Game();
//        Board board = new Board(3, 3);
//        game.setBoard(board);
//
//        HumanPlayer human = new HumanPlayer();
//        human.setSymbol(GameSymbol.O);
//        human.setUser(User.builder().email("email@gmail.com").build());
//
//        Bot bot = new Bot();
//        bot.setSymbol(GameSymbol.X);
//
//        game.setPlayers(Arrays.asList(human, bot));
//        return game;
//    }
//
//    @Test
//    public void testDimension(){
//        List<List<BoardCell>> cells = game.getBoard().getCells();
//        assertEquals("If board is created, number of rows should be equal to input", 3, cells.size());
//
//        List<BoardCell> firstRow =cells.get(0);
//        assertEquals("If board is created, number of columns should be equal to input", 3, firstRow.size());;
//
//    }
public class TicTacToeTest {
    private Game game;

    @Before
    public void setUp() {
        this.game = createGame();
    }

    public Game createGame() {

        Game game = Game.getBuilder()
                .withDimensions(3, 3)

                .withPlayers(
                        HumanPlayer.builder()
                                .symbol(GameSymbol.O)
                                .user(
                                        User.builder()
                                                .email("abc@gmail.com")
                                                .build())
                                .build())

                .withPlayers(
                        Bot.builder()
                                .symbol(GameSymbol.X)
                                .build())

                .build();

        return game;
    }

    @Test
    public void testDimension() {
        List<List<BoardCell>> cells = game.getBoard().getCells();
        assertEquals("If board is created, number of rows should be equal to input", 3, cells.size());

        List<BoardCell> firstRow = cells.get(0);
        assertEquals("If board is created, number of columns should be equal to input", 3, firstRow.size());
        ;

    }


}
