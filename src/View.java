public class View {
    public View() {

    }

    public void printMenu() {
        System.out.println("Main menu:\n" +
                           "1. New game\n" +
                           "2. High score\n" +
                           "3. Credits");
    }

    public void printGameModes() {
        System.out.println("Game modes:\n" +
                           "1. Player vs Player\n" +
                           "2. Player vs Computer\n" +
                           "3. Computer vs Computer");
    }

    public void printGameDifficulty() {
        System.out.println("Game difficulty:\n" +
                           "1. Player vs Player\n" +
                           "2. Player vs Computer\n" +
                           "3. Computer vs Computer");
    }

    public void printQuestion(String question) {
        System.out.print(question + "?: ");
    }

    public void printError(String error) {
        System.out.println(("Error: " + error));
    }

    public void printMap(String map) {
        System.out.println(map);
    }
}