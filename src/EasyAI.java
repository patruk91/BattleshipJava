import java.util.ArrayList;
import java.util.List;

public class EasyAI extends AI {
    private List<Coordinates> possibleShoots;

    public EasyAI(String name, View viewer) {
        super(name, viewer);
        this.possibleShoots = new ArrayList<Coordinates>();
        this.fillShootsList();
    }

    private void fillShootsList() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                this.possibleShoots.add(new Coordinates(i, j));
            }
        }
    }
    public Coordinates getRandomCoordinates(Randomizer randomizer) {
        int shootListIndex = randomizer.getRandomDigitFromParamter(possibleShoots.size());
        return this.possibleShoots.get(shootListIndex);
    }
}