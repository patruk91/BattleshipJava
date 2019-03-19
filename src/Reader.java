import java.util.*;

public class Reader {
    Scanner reader = new Scanner(System.in);
    
    Public Reader(){
        this.reader = new Scanner(System.in);
    }

    private String readString(){
        System.out.println("Please provide data: ");
        String userInput = this.reader.nextLine();
        reader.close();
        return userInput;

    }

    public String getStringFromUser(){
        return userString;
    }

    public Integer getIntFromUser(){
        int userInteger = 0;
        return userInteger;
    }

    public Integer getUserCoordinates(){
        int userInteger2 = 0;
        return userInteger2;

    }



}