package game.actions;

import game.code.Card;
import game.code.Game;

public abstract class ActionCard extends Card {
    protected ActionStrategy actionStrategy;

    public ActionCard(String color, String value) {
        super(color, value);
    }

    public void setActionStrategy(ActionStrategy actionStrategy) {
        this.actionStrategy = actionStrategy;
    }

    @Override
    public void applyEffect(Game game) {
        actionStrategy.execute(game);
    }
}
