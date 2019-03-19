public class ReaderHelper {
    public ReaderHelper() {

    }

    public String[] splitCoordinates(String input) {
        return input.split("(?<=\\D)(?=\\d)");
    }

    public int[] convertCoordinates(String[] coordinates) {
        
    }
}