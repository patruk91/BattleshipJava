import java.util.Map;
import java.util.TreeMap;

public class Controller {
    private boolean restartGame;
    private View view;
    private Reader reader;
    private ControllerHelper controllerHelper;

    public Controller() {
        this.restartGame = false;
        this.view = new View();
        this.reader = new Reader(this.view);
        this.controllerHelper = new ControllerHelper();

    }

    public void runner() {
        while (!this.restartGame) {
            handleMainOption(reader, view);
        }
    }

    private void handleMainOption() {
        this.view.printMenu();
        this.view.printQuestion("Option");
        int option = this.reader.getIntFromUser(1, 4);
        switch (option) {
            case 1:
                handleGameModes();
                break;
            case 2:
                this.view.printHighscore();
                break;
            case 3:
                this.view.printCredits();
                break;
            case 4:
                this.restartGame = true;
                break;

        }
    }

    private void handleGameModes() {
        this.view.printGameModes();
        int gameModes = this.reader.getIntFromUser(1, 3);
        this.view.printQuestion("Choose your game mode");
        switch (gameModes) {
            case 1:
                playerVsPlayer();
                break;
            case 2:
                handleGameDifficulty(gameModes);
                break;
            case 3:
                handleGameDifficulty(gameModes);
                break;
        }
    }

    private void handleGameDifficulty(int gameModes) {
        this.view.printGameDifficulty();
        int gameDifficulty = this.reader.getIntFromUser(1, 2);

        switch (gameModes) {
            case 2:
//                playerVsComputer(gameDifficulty);
                break;
            case 3:
//                computerVsComputer(gameDifficulty);
                break;
        }
    }

    private void playerVsPlayer() {

        this.view.printQuestion("Player one: what's is your name");
        this.reader.

        Player playerOne = new Player()

        this.view.printQuestion("Player two: what's is your name");

    }


}
