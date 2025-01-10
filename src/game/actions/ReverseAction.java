package game.actions;

import game.code.Game;

public class ReverseAction implements ActionStrategy {
    @Override
    public void execute(Game game) {
        System.out.println("Action: Reverse");
    }
}