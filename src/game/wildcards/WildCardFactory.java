package game.wildcards;

public class WildCardFactory {
    public static WildCard createWildCard(String value) {
        WildCardEffect effect = switch (value) {
            case "Wild" -> new ChangeColorEffect();
            case "Wild Draw Four" -> new DrawFourEffect();
            default -> throw new IllegalArgumentException("Unknown wild card type: " + value);
        };

        return new WildCard(value, effect);
    }
}
