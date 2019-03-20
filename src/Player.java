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

    public Ocean shipPlacement(int x, int y, String diretion, Ocean ocean, String shipName){
        return this.ocean;
    }

    
}