import java.util.Map;
import java.util.TreeMap;

public class Controller {
    private boolean restartGame;
    private View view;
    private Reader reader;
    private ControllerHelper controllerHelper;
    private Randomizer randomizer;

    public Controller() {
        this.restartGame = false;
        this.view = new View();
        this.reader = new Reader(this.view);
        this.controllerHelper = new ControllerHelper();
        this.randomizer = new Randomizer();

    }

    public void runner() {
        while (!this.restartGame) {
            handleMainOption();
        }
    }

    private void handleMainOption() {
        this.view.printMenu();
        int option = this.reader.getIntFromUser("Option", 1, 4);
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
        int gameModes = this.reader.getIntFromUser("Choose your game mode", 1, 3);
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
        int gameDifficulty = this.reader.getIntFromUser("Choose your game difficulty", 1, 2);

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
        Player playerOne = createPlayer("Player one: what's is your name");
        Player playerTwo = createPlayer("Player two: what's is your name");

        String placement  = this.reader.getStringFromUser(
                "Do you want put your ship automatically (y/n)", "[yn]{1}");

        putShipsOnMap(playerOne, placement.equals("y"));



    }

    private void putShipsOnMap(Player player, boolean automate) {
        Coordinates getCoordinates = randomizer.getRandomCoordantes();
        String direction = randomizer.getRandomDirection();

        if (!automate) {
            this.view.printMap(player.getOcean().mapToString("ship"));
        }

        for (Map.Entry<String, Integer> entry : controllerHelper.getShipNamesWithLength().entrySet()) {
            boolean isShipPlaced = false;
            while (!isShipPlaced) {
                if (automate) {
                    getCoordinates = randomizer.getRandomCoordantes();
                    direction = randomizer.getRandomDirection();

                } else {
                    String questionShip = "Please provide a coordinate for " + entry.getKey() + ", length: " + entry.getValue() + " (e.g A1)";
                    getCoordinates = reader.getUserCoordinates(questionShip);
                    direction = this.reader.getStringFromUser("Vertically or horizontally (h/v)", "[hv]{1}");
                }

                isShipPlaced = player.shipPlacement(getCoordinates, direction, entry.getKey(), entry.getValue(), automate);

                if (!automate) {
                    this.view.printMap(player.getOcean().mapToString("ship"));

                }
            }
        }
        if (automate) {
            this.view.printMap(player.getOcean().mapToString("ship"));
        }
    }


    private Player createPlayer(String name) {
        String player = this.reader.getNameFromUser(name);
        return new Player(player, this.view);
    }


}
