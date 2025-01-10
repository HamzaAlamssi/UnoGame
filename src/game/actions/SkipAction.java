package game.actions;

import game.code.Game;

public class SkipAction implements ActionStrategy {
    @Override
    public void execute(Game game) {
        System.out.println("Action: Skip");
    }
}