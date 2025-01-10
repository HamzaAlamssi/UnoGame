package game.actions;

import game.code.Game;

public class DrawTwoAction implements ActionStrategy {
    @Override
    public void execute(Game game) {
        System.out.println("Action: Draw Two");
    }
}