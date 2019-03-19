import java.util.*;

public class Battleship {
    public static void startGame(String[] args) {
    boolean playAgain = true;
    Scanner scanner = new Scanner(System.in);
    while (playAgain){
        // Controller.runner();
        System.out.println("Play again? Y/N: ");
            String userInput = scanner.nextLine().toUpperCase();
            if (userInput.equals("N")) {
                playAgain = false;
            }
            scanner.close();
    }
    }
}
