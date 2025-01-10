package game.code;

public abstract class Card {
    protected String color;
    protected String value;

    public Card(String color, String value) {
        this.color = color;
        this.value = value;
    }

    public String getColor() {
        return color;
    }

    public String getValue() {
        return value;
    }

    public abstract void applyEffect(Game game);
}
