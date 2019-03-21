import java.util.ArrayList;
import java.util.List;

public class HardAI extends AI {
    List<Coordinates> nearShip;

    public HardAI(String name, View viewer) {
        super(name, viewer);
        this.nearShip = new ArrayList<Coordinates>();
    }

    public Coordinates getRandomCoordinates(Randomizer randomizer) {
        int shootListIndex = -1;
        Coordinates shootCoodinates = null;
        if (this.nearShip.isEmpty()) {
            shootListIndex = randomizer.getRandomDigitFromParamter(this.getPossibleShoots().size());
            shootCoodinates = this.getPossibleShoots().get(shootListIndex);
            this.removeUsedCoordinates(shootListIndex);
        } else {
            shootListIndex = randomizer.getRandomDigitFromParamter(this.nearShip.size());
            shootCoodinates = this.nearShip.get(shootListIndex);
            this.removeNearShipCoordinate(shootListIndex);
        }
        return shootCoodinates;
    }

    private void removeNearShipCoordinate(int index) {
        this.nearShip.remove(index);
    }

    public void shootWasHit(boolean isHit, Coordinates coordinates) { // isHit in methode call shoud be Player.shoot()
        if (isHit) {
            this.pupulateNearShip(coordinates);
        }
    }

    private void pupulateNearShip(Coordinates coordinates) {
        int x = coordinates.getX();
        int y = coordinates.getY();
        this.nearShip.add(new Coordinates(x + 1, y));
        this.nearShip.add(new Coordinates(x - 1, y));
        this.nearShip.add(new Coordinates(x, y + 1));
        this.nearShip.add(new Coordinates(x, y - 1));
    }
}