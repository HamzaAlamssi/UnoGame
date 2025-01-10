package game.actions;

public class ActionCardFactory {
    public static ActionCard createActionCard(String color, String value) {
        return ActionCardRegistry.createActionCard(color, value);
    }
}
