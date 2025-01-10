package game.actions;

public class ReverseCard extends ActionCard {
    public ReverseCard(String color) {
        super(color, "Reverse");
        this.setActionStrategy(new ReverseAction());
    }
}