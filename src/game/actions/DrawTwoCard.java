package game.actions;

public class DrawTwoCard extends ActionCard {
    public DrawTwoCard(String color) {
        super(color, "Draw Two");
        this.setActionStrategy(new DrawTwoAction());
    }
}
