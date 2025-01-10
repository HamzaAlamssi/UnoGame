package game.wildcards;

import game.code.Game;

public class DrawFourEffect implements WildCardEffect {
    @Override
    public void apply(Game game) {
        System.out.println("Draw Four effect applied");
    }
}