public class Player {
    Ocean ocean;
    String name;
    Reader reader = new Reader();

    public Player() {
        this.ocean = new Ocean();
        this.name = name;
        
    }

    public String getName() {
        System.out.println("Hey, what's your name?");
        this.name = reader.getStringFromUser();
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