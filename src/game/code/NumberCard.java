package game.code;

public class NumberCard extends Card {

    public NumberCard(String color, String value) {
        super(color, value);
    }

    @Override
    public void applyEffect(Game game) {
        System.out.println("Number card played: " + color + " " + value);
    }
}
