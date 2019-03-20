import java.util.*;

public class Reader {
    Scanner reader = new Scanner(System.in);
    
    Public Reader(){
        this.reader = new Scanner(System.in);
    }

    private String readString(){
        String userInput = this.reader.nextLine();
        reader.close();
        return userInput;

    }

    public String getStringFromUser(){
        return userString;
    }

    public Integer getIntFromUser(){
        return userInteger;
    }

    public Integer getUserCoordinates(){
        return userInteger2;

    }



}