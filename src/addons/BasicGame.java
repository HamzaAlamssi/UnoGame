package addons;

import game.code.Card;
import game.code.Game;
import game.code.Player;

import java.util.List;

public class BasicGame extends Game {

    public BasicGame(List<Player> players) {
        super(players);
    }

    @Override
    public void play() {
        System.out.println("Starting Basic Uno Game");
        dealCards();

        setCurrentCard(deck.drawCard());
        System.out.println("First card: " + getCurrentCard().getColor() + " " + getCurrentCard().getValue());

        while (!isGameOver()) {
            for (Player player : players) {
                takeTurn(player);
                if (isGameOver()) {
                    break;
                }
            }
        }
        System.out.println("Game Over");
    }

    @Override
    protected void dealCards() {
        for (Player player : players) {
            for (int i = 0; i < 7; i++) {
                player.drawCard(deck.drawCard());
            }
        }
    }

    @Override
    protected boolean isGameOver() {
        return players.stream().anyMatch(Player::hasWon);
    }

    @Override
    protected void takeTurn(Player player) {
        System.out.println(player.getName() + "'s turn:");

        Card cardToPlay = null;
        if (player.getNumOfCards() > 13) {
            System.out.println(player.getName() + " has more than 13 cards and can play any card.");
            cardToPlay = player.getHand().get(0);
        } else {
            for (Card card : player.getHand()) {
                if (isPlayable(card)) {
                    cardToPlay = card;
                    break;
                }
            }
        }

        if (cardToPlay != null) {
            player.playCard(cardToPlay, this);
            deck.addToDiscardPile(cardToPlay);
            setCurrentCard(cardToPlay);
            System.out.println("Card played: " + cardToPlay.getColor() + " " + cardToPlay.getValue() + "\nPlayer Cards: " + player.getNumOfCards());
        } else {
            System.out.println("No playable card, drawing a card");
            player.drawCard(deck.drawCard());
        }

        if (player.hasWon()) {
            System.out.println(player.getName() + " has won the game");
        }
    }
}