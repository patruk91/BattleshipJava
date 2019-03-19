public class Player {
    Ocean ocean;
    String name;

    public static void main(String[] args) {
        // USE IT TO TEST ONLY

        String name = getName();
        System.out.println(name);
    }
    public Player() {
        ocean = new Ocean();
        this.name = name;

    public String getName(){
        System.out.println("Hey, what's your name?");
        String userName = Reader.readString();
        return userName;
    }

    public Ocean getOcean(Ocean ocean){
        // handle grid data
        return oceanData;
    }

    public void shoot(String Coordinates){
        // ask for coordinates, use Reader class
        // check if square is ocean or ship
        // make changes on map
    }

    public Ocean shipPlacement(int x, int y, String diretion, Ocean ocean, String shipName){
        return ship;
    }

    
}