import java.util.Map;
import java.util.HashMap;

public class ReaderHelper {
    public ReaderHelper() {

    }

    public String[] splitCoordinates(String input) {
        return input.split("(?<=\\D)(?=\\d)");
    }

    public int[] convertCoordinates(String[] coordinates) {
        Map<String, Integer> lettersToNumbers = new HashMap<String, Integer>();
        for (int i = 0; i < 10; i++) {
            lettersToNumbers.put(Character.toString((char) i+65), i);
        }
        int numericCoordinate = Integer.parseInt(coordinates[1]);
        int letterCoordinate = lettersToNumbers.get(coordinates[0]);
        int[] convertedCoordinates = {letterCoordinate, numericCoordinate}
        return convertedCoordinates;
    }
}