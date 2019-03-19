import java.util.ArrayList;
import java.util.List;

public class Ship {
    private List<Square> shipSquares;

    Ship(int x, int y, String direction, Ocean ocean, int length) {
        this.shipSquares = new ArrayList<Square>();
        getShipSquares(x, y, ocean, direction, length);
    }

    public void getShipSquares(int x, int y, Ocean ocean, String direction, int shipLength) {
        for (int i = 0; i < shipLength; i++) {
            this.shipSquares.add(ocean.getSquare(x, y));
            if (direction.equals("horizontal")) {
                y++;
            } else {
                x++;
            }
        }
    }

    public boolean isDestroyed() {
        for (Square square: shipSquares) {
            if (square.getMyStatus().equals("S")) {
                return false;
            }
        }
        return true;
    }
}
