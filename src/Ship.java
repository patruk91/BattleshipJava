import java.util.ArrayList;
import java.util.List;

public class Ship {
    boolean isSunk = false;
    private List<Square> shipSquares;

    Ship(int x, int y, String direction, Ocean ocean, int length) {
        getShipSquares(x, y, ocean, direction, length);
    }

    public void getShipSquares(int x, int y, Ocean ocean, String direction, int shipLength) {
        this.shipSquares.add(ocean.getSquare(this.x, this.y));
    }

    public boolean isShipSunk() {
        return this.isSunk;
    }







}
