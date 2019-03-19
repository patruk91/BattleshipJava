import java.util.HashMap;
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

    public boolean testShipPlacement(int x, int y, int length, String direction) {
        final int BORDER = 10;

        if (direction.equalsIgnoreCase("h")) {
            return (x + length) < BORDER;
        } else if (direction.equalsIgnoreCase("v")) {
            return (y + length) < BORDER;
        } else {
            return false;
        }
    }

    public String myMap() {
        String mapResult = "";
        for (Square[] row : this.map) {
            for (Square column : row) {
                mapResult += column.getMyStatus();
            }
            mapResult += "\n";
        }
        return mapResult;
    }





}
