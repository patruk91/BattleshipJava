public class Player {
    private Ocean ocean;
    private String name;
    Reader reader;

    public Player(String name) {
        this.ocean = new Ocean();
        this.name = name;
        this reader = new Reader();
    }

    public String getName() {
        return this.name;
    }

    public Ocean getOcean(){
        return this.ocean;
    }

    public void shoot(String convertedCoordinates){
    }

    public void shipPlacement(Coordinates coordinates, String direction, String shipName, int shipLength){
        if (this.ocean.testShipPlacement(coordinates, shipLength, direction)){
            Ship ship = new Ship(coordinates, this.ocean, direction, shipLength, shipName)
        }
    }

    private List<Square> getShipSquares(Coordinates coordinates, String direction, int shipLength, String shipName) {
        int x = coordinates.getX();
        int y = coordinates.getY();
        List<Square> shipSquares = new ArrayList<Square>();
        for (int i = 0; i < shipLength; i++) {
            shipSquares.add(ocean.getSquare(x, y));
            this.ocean.getSquare(x, y).setMyStatus("S");
            this.ocean.getSquare(x, y).setShipName(shipName);
            if (direction.equalsIgnoreCase("h")) {
                y++;
            } else {
                x++;
            }
        }
    }

    
}