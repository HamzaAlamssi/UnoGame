package driver;

import game.code.Player;
import game.util.CardRegistration;
import addons.BasicGame;

import java.util.ArrayList;
import java.util.List;

public class GameDriver {
    public static void main(String[] args) {
        CardRegistration.registerAllCards();
        List<Player> players = new ArrayList<>();
        players.add(new Player("Hamza"));
        players.add(new Player("Wadee"));
        players.add(new Player("Zidan"));

        BasicGame game = new BasicGame(players);
        game.play();
    }
}
