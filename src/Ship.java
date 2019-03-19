import java.util.ArrayList;
import java.util.List;

public class Ship {
    private List<Square> shipSquares;

    Ship(int x, int y, String direction, Ocean ocean, int length, String shipName) {
        this.shipSquares = new ArrayList<Square>();
        getShipSquares(x, y, ocean, direction, length, shipName);
    }

    private void getShipSquares(int x, int y, Ocean ocean, String direction, int shipLength, String shipName) {
        for (int i = 0; i < shipLength; i++) {
            this.shipSquares.add(ocean.getSquare(x, y));
            ocean.getSquare(x, y).setMyStatus("S");
            ocean.getSquare(x, y).setShipName(shipName);
            if (direction.equalsIgnoreCase("h")) {
                y++;
            } else {
                x++;
            }
        }
    }

    public boolean isDestroyed() {
        for (Square square: this.shipSquares) {
            if (square.getMyStatus().equals("S")) {
                return false;
            }
        }
        return true;
    }

    public void markHit(Square square) {
        square.setMyStatus("X");
        square.setOpponentStatus("X");
        if (this.isDestroyed()) {
            this.markAsSunk();
        }
    }

    private void markAsSunk() {
        for (Square square: this.shipSquares) {
            square.setMyStatus("#");
        }
    }
}
