package game.code;

import game.wildcards.WildCard;

import java.util.List;

public abstract class Game {
    protected List<Player> players;
    protected Deck deck;
    protected Card currentCard;

    public Game(List<Player> players) {
        this.players = players;
        this.deck = new Deck();
    }

    public abstract void play();

    protected abstract void dealCards();

    protected abstract boolean isGameOver();

    protected abstract void takeTurn(Player player);

    protected boolean isPlayable(Card card) {
        return card.getColor().equals(currentCard.getColor()) ||
                card.getValue().equals(currentCard.getValue()) ||
                card instanceof WildCard;
    }

    protected void setCurrentCard(Card card) {
        this.currentCard = card;
    }

    public Card getCurrentCard() {
        return currentCard;
    }
}
