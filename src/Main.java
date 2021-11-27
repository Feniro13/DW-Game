import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        System.out.println("Version: 0.1");
        game.startGame();
        game.mainGame();
        System.out.println("Game over.");
    }
}
