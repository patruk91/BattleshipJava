import java.util.Map;
import java.util.TreeMap;

public class Controller {
    private boolean restartGame;

    public Controller() {
        this.restartGame = false;

    }




    public void runner() {
        View view = new View();
        Reader reader = new Reader();
        ControllerHelper controllerHelper = new ControllerHelper();
        Player firstPlayer = new Player();
        Player secondPlayer = new Player();


        while (!this.restartGame) {
            handleMainOption(reader, view, firstPlayer);


            while (!(firstPlayer.getOcean().isGameOver() || secondPlayer.getOcean().isGameOver())) {

            }
        }

    }

    private void handleMainOption(Reader reader, View view, Player firstPlayer) {
        view.printMenu();
        view.printQuestion("Option");
        int option = reader.getIntFromUser(1, 4);
        switch (option) {
            case 1:
                option = 1;
                view.printGameModes();
                int gameModes = reader.getIntFromUser(1, 3);
                view.printQuestion("Choose your game mode");


                break;
            case 2:
                option = 2;
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

    private void handleGameModes() {

    }

}
