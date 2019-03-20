public class View {
    public View() {

    }

    public void printMenu() {
        System.out.println("Main menu:\n" +
                           "1. New game\n" +
                           "2. High score\n" +
                           "3. Credits");
    }

    public void prntChoseGame() {
        System.out.println("Game modes:" +
                           "1. Player vs Player\n" +
                           "2. Player vs Computer\n" +
                           "3. Computer vs Computer");
    }

    public void prontChoseDifficulty() {
        System.out.println("Game difficulty:" +
                           "1. Player vs Player\n" +
                           "2. Player vs Computer\n" +
                           "3. Computer vs Computer");
    }

    public void printQuestion(String question) {
        System.out.print(question + ": ");
    }

    public void printError(String error) {
        System.out.println(("Error: " + error));
    }
}