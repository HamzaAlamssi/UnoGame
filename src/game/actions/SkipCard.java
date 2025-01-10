package game.actions;

public class SkipCard extends ActionCard {
    public SkipCard(String color) {
        super(color, "Skip");
        this.setActionStrategy(new SkipAction());
    }
}