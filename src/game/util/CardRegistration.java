package game.util;

import game.actions.ActionCardRegistry;
import game.actions.DrawTwoCard;
import game.actions.ReverseCard;
import game.actions.SkipCard;
import game.wildcards.WildCardFactory;

public class CardRegistration {

    public static void registerAllCards() {
        registerActionCards();
        registerWildCards();
    }

    private static void registerActionCards() {
        ActionCardRegistry.registerActionCard("Skip", SkipCard::new);
        ActionCardRegistry.registerActionCard("Reverse", ReverseCard::new);
        ActionCardRegistry.registerActionCard("Draw Two", DrawTwoCard::new);
    }

    private static void registerWildCards() {
        WildCardFactory.createWildCard("Wild");
        WildCardFactory.createWildCard("Wild Draw Four");
    }
}
