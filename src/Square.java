public class Square {
    private int x;
    private int y;
    private String shipName = "ocean";
    private String status = " ";


    public Square(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getShipName() {
        return shipName;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return status;
    }
}
