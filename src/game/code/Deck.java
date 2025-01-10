package game.code;

import game.actions.ActionCardFactory;
import game.wildcards.WildCardFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final List<Card> drawPile;
    private final List<Card> discardPile;

    public Deck() {
        this.drawPile = new ArrayList<>();
        this.discardPile = new ArrayList<>();
        initializeDeck();
        shuffle();
    }

    private void initializeDeck() {
        for (String color : new String[]{"Red", "Yellow", "Green", "Blue"}) {
            for (int i = 0; i <= 9; i++) {
                drawPile.add(new NumberCard(color, String.valueOf(i)));
            }
            drawPile.add(ActionCardFactory.createActionCard(color, "Skip"));
            drawPile.add(ActionCardFactory.createActionCard(color, "Reverse"));
            drawPile.add(ActionCardFactory.createActionCard(color, "Draw Two"));
        }
        drawPile.add(WildCardFactory.createWildCard("Wild"));
        drawPile.add(WildCardFactory.createWildCard("Wild Draw Four"));
    }
    public void shuffle() {
        Collections.shuffle(drawPile);
    }

    public Card drawCard() {
        if (drawPile.isEmpty()) {
            reshuffleDeck();
        }
        return drawPile.isEmpty() ? null : drawPile.removeLast();
    }

    public void addToDiscardPile(Card card) {
        discardPile.add(card);
    }

    private void reshuffleDeck() {
        if (!discardPile.isEmpty()) {
            System.out.println("Reshuffling pile");
            Card lastPlayedCard = discardPile.removeLast();
            drawPile.addAll(discardPile);
            discardPile.clear();
            discardPile.add(lastPlayedCard);
            shuffle();
        } else {
            System.out.println("No cards left, generating new cards.");
            generateNewCards();
        }
    }

    private void generateNewCards() {
        initializeDeck();
        shuffle();
    }
}
