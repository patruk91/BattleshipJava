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
        // ask for coordinates, use Reader class
        // check if square is ocean or ship
        // make changes on map
    }

    public void shipPlacement(Coordinates coordinates, String direction, String shipName, int shipLength){
        if (this.ocean.testShipPlacement(coordinates, shipLength, direction)){
            Ship ship = new Ship(coordinates, this.ocean, direction, shipLength, shipName)
        }
    }

    
}