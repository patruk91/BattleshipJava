import java.util.Map;
import java.util.TreeMap;

public class Controller {
    private boolean restartGame;

    public Controller() {
        this.restartGame = false;

    }




    public void runner() {
        View view = new View();
        Reader reader = new Reader(view);
        ControllerHelper controllerHelper = new ControllerHelper();



        while (!this.restartGame) {
            handleMainOption(reader, view, firstPlayer);


        }

    }

    private void handleMainOption(Reader reader, View view, Player firstPlayer) {
        view.printMenu();
        view.printQuestion("Option");
        int option = reader.getIntFromUser(1, 4);
        switch (option) {
            case 1:
                handleGameModes(view, reader);
                break;
            case 2:
                view.printHighscore();
                break;
            case 3:
                view.printCredits();
                break;
            case 4:
                this.restartGame = true;
                firstPlayer.getOcean().setIsGameOver(true);
                break;

        }
    }

    private void handleGameModes(View view, Reader reader) {
        view.printGameModes();
        int gameModes = reader.getIntFromUser(1, 3);
        view.printQuestion("Choose your game mode");
        switch (gameModes) {
            case 1:
                playerVsPlayer();
                break;
            case 2:
                handleGameDifficulty(view, reader, gameModes);
                break;
            case 3:
                handleGameDifficulty(view, reader, gameModes);
                break;
        }
    }

    private void handleGameDifficulty(View view, Reader reader, int gameModes) {
        view.printGameDifficulty();
        int gameDifficulty = reader.getIntFromUser(1, 2);

        switch (gameModes) {
            case 2:
                playerVsComputer(gameDifficulty);
                break;
            case 3:
                computerVsComputer(gameDifficulty);
                break;
        }
    }


}
