import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ocean {
    private Square[][] map;
    private Map<String, Ship> ships;
    boolean isGameOver;

    public Ocean() {
        this.map = new Square[10][10];
        this.ships = new HashMap<>();
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
            int startX = getStartXPosition(x);
            int startY = getStartYPosition(y);

            int startX = x - 1;
            int startY = y - 1;


            for (int line = 1; line <= totalLinesToCheck; line++) {
                for (int square = 1; square <= squaresInLineToCheck; square++) {
                    if (!((x - 1) < 0 && (y - 1) < 0)) {
                        if (!(getSquare(startX, startY).getShipName().equals("ocean"))) {
                            return false;
                        }
                    } else {
                        startX += square;
                    }
                }
                startY += line;
            }
            return true;
        }
        return false;
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
