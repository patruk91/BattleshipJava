import java.util.ArrayList;
import java.util.List;

public class Ship {
    private int x;
    private int y;
    private String direction;
    private List<Square> shipSquares;

    Ship(int x, int y, String direction, Ocean ocean) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        getShipSquares(ocean, direction);
    }

    public void getShipSquares(Ocean ocean, String direction) {
        this.shipSquares.add(ocean.getSquare(this.x, this.y));
    }







}
