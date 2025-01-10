package game.wildcards;

import game.code.Card;
import game.code.Game;

public class WildCard extends Card {
    private final WildCardEffect wildCardEffect;

    public WildCard(String value, WildCardEffect wildCardEffect) {
        super("Wild", value);
        this.wildCardEffect = wildCardEffect;
    }

    @Override
    public void applyEffect(Game game) {
        System.out.println("Wild card played: " + value);
        wildCardEffect.apply(game);
    }
}
