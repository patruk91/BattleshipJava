import java.util.Map;
import java.util.TreeMap;

public class ControllerHelper {

    public ControllerHelper() {

    }

    public Map<String, Integer> getShipNamesWithLength() {
        Map<String, Integer> shipNames = new TreeMap<>();
        shipNames.put("Carrier", 5);
        shipNames.put("Battleship", 4);
        shipNames.put("Cruiser", 3);
        shipNames.put("Submarine", 3);
        shipNames.put("Destroyer", 2);

        return shipNames;
    }

}
