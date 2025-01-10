package game.wildcards;

import game.code.Game;

import java.util.Scanner;

public class ChangeColorEffect implements WildCardEffect {
    @Override
    public void apply(Game game) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a color: Red, Yellow, Green, Blue");
        String color = scanner.nextLine().trim();

        while (!color.equalsIgnoreCase("Red") &&
                !color.equalsIgnoreCase("Yellow") &&
                !color.equalsIgnoreCase("Green") &&
                !color.equalsIgnoreCase("Blue")) {
            System.out.println("Invalid color. Please choose from Red, Yellow, Green, or Blue.");
            color = scanner.nextLine().trim();
        }

        System.out.println("Color changed to: " + color);
    }
}
