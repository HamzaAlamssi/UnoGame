package game.code;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final String name;
    private final List<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public int getNumOfCards(){
        return  hand.size();
    }
    public List<Card> getHand() {
        return hand;
    }

    public void drawCard(Card card) {
        hand.add(card);
    }

    public void playCard(Card card, Game game) {
        hand.remove(card);
        card.applyEffect(game);
    }

    public boolean hasWon() {
        return hand.isEmpty();
    }
}
