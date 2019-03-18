import java.util.Map;
import java.util.TreeMap;

public class Controller {


    public void runner() {
        Ocean ocean = new Ocean();
        ocean.createSquareMap();

        for (Map.Entry<String, Integer> entry : shipNames().entrySet()) {

        }

    }


    public Map<String, Integer> shipNames() {
        Map<String, Integer> shipNames = new TreeMap<>();
        shipNames.put("Carrier", 5);
        shipNames.put("Battleship", 4);
        shipNames.put("Cruiser", 3);
        shipNames.put("Submarine", 3);
        shipNames.put("Destroyer", 2);

        return shipNames;
    }
}
