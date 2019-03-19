import java.util.*;

public class Reader {
    Scanner reader = new Scanner(System.in);
    

    private String readString(){
        System.out.println("Please provide data: ");
        String userInput = reader.nextLine();
        reader.close();
        return userInput;

    }

    public String getStringFromUser(){
        System.out.println("Please provide data: ");
        String userString = reader.nextLine();
        reader.close();
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