import java.util.*;

public class Reader {
    Scanner read = new Scanner(System.in);

    private String readString(){
        System.out.println("Please provide data: ");
        String userInput = read.nextLine();
        read.close();
        return userInput;

    }

    public String getStringFromUser(String userString){
        System.out.println("Please provide data: ");
        userString = reader.nextLine();
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