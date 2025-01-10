package game.actions;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ActionCardRegistry {
    private static final Map<String, Function<String, ActionCard>> registry = new HashMap<>();

    public static void registerActionCard(String action, Function<String, ActionCard> creator) {
        registry.put(action, creator);
    }

    public static ActionCard createActionCard(String color, String value) {
        Function<String, ActionCard> creator = registry.get(value);
        if (creator != null) {
            return creator.apply(color);
        } else {
            throw new IllegalArgumentException("Unknown action: " + value);
        }
    }
}
