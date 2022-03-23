package Designs.SnakeAndLadders;

import Designs.SnakeAndLadders.Commands.CommandRegistry;
import Designs.SnakeAndLadders.Commands.CreateUser;
import Designs.SnakeAndLadders.Exceptions.InvalidCommandException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {

//    1. The Game cells can be numbered from 1 to M.
//    2. The Game can have N players.
//    3. The Game can have X no of dices.
//    4. Each Dice can be upto Y.
//    5. All Human players.
//    6. Each player's play turn by turn.
//    7. Each player can have Y pieces.
//        Player 1 Piece 1
//        Player 2 Piece 1
//        Player 1 Piece 2
//        Player 2 Piece 2
//    8. User - username, email.
//    9. Game will end when only one player is left
    public static void main(String[] args) {
        CommandRegistry commandRegistry = createRegistry();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println(">");
            try {
                String input = br.readLine().toString();
                commandRegistry.execute(input);
            } catch (InvalidCommandException e) {
                System.out.println("Command is invalid");
            } catch (IOException e) {
                System.out.println("ISE: System error");
            }

        }
    }

    private static CommandRegistry createRegistry() {

        CommandRegistry registry = new CommandRegistry();

        registry.register(new CreateUser());
        return registry;
    }
}
