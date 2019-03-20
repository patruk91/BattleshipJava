import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ocean {
    private Square[][] map;
    private Map<String, Ship> ships;
    boolean isGameOver;

    public Ocean() {
        this.map = new Square[10][10];
        this.ships = new HashMap<String, Ship>();
        this.isGameOver = false;
    }

    public void createSquareMap() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                this.map[i][j] = new Square();
            }
        }
    }

    public Square getSquare(int x, int y) {
        return this.map[x][y];
    }

    public boolean isGameOver() {
        return this.isGameOver;
    }

    public void setIsGameOver(boolean gameOver) {
        this.isGameOver = gameOver;
    }

    private boolean checkIfAllShipsSunk() {
        for (Map.Entry<String, Ship> entry : this.ships.entrySet()) {
            if (!entry.getValue().isDestroyed()) {
                return false;
            }
        }
        return true;
    }

    private void addShip(String shipName, Ship ship) {
        this.ships.put(shipName, ship);
    }

    public void changeGameStatus() {
        if (checkIfAllShipsSunk()) {
            setIsGameOver(true);
        }
    }

    public boolean testShipPlacement(int x, int y, int shipLength, String direction) {
        if (checkIfShipInMap(x, y, shipLength, direction)) {
            final int EXTRA_SQUARES = 2;
            int totalLinesToCheck = getLinesToCheck(direction, shipLength, EXTRA_SQUARES);
            int squaresInLineToCheck = getSquaresToCheck(direction, shipLength, EXTRA_SQUARES);

            for (int startY = getStartYPosition(y); startY <= totalLinesToCheck; startY++) {
                for (int startX = getStartXPosition(x); startX <= squaresInLineToCheck; startX++) {
                    if (!((startY) < 0 && (startX) < 0)) {
                        if (!(getSquare(startX, startY).getShipName().equals("ocean"))) {
                            // or StartY, StartX
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    private int getStartXPosition(int x) {
        final int BACK_X_POSITION = 1;
        return x - BACK_X_POSITION;
    }

    private int getStartYPosition(int y) {
        final int BACK_Y_POSITION = 1;
        return y - BACK_Y_POSITION;
    }

    private int getLinesToCheck(String direction, int shipLength, int extraSquares) {
        final int HORIZONTAL_LINES_TO_CHECK = 3;
        if (direction.equalsIgnoreCase("h")) {
            return HORIZONTAL_LINES_TO_CHECK;
        } else {
            return shipLength + extraSquares;
        }
    }

    private int getSquaresToCheck(String direction, int shipLength, int extraSquares) {
        final int VERTICAL_SQUARES_TO_CHECK = 3;
        if (direction.equalsIgnoreCase("h")) {
            return shipLength + extraSquares;
        } else {
            return VERTICAL_SQUARES_TO_CHECK;
        }
    }

    private boolean checkIfShipInMap(int x, int y, int length, String direction) {
        final int BORDER = 10;
        if (direction.equalsIgnoreCase("h")) {
            return (x + length) < BORDER;
        } else if (direction.equalsIgnoreCase("v")) {
            return (y + length) < BORDER;
        } else {
            return false;
        }
    }

    public String mapToString(String view) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Square[] row : this.map) {
            for (Square column : row) {
                if (view.equals("ship")) {
                    stringBuilder.append(column.getMyStatus());
                } else {
                    stringBuilder.append(column.getOpponentStatus());
                }
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

}
