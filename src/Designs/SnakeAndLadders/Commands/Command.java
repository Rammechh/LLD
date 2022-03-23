package Designs.SnakeAndLadders.Commands;

public interface Command {

    public Boolean matches(String command);

    public void execute(String command);

}
