import java.util.*;

public class Reader {
    Scanner reader;
    Validator validator;
    ReaderHelper helper;

    Public Reader(){
        this.reader = new Scanner(System.in);
        this.validator = new Validator();
        this.helper = new ReaderHelper();
    }

    private String readString(){
        String userInput = this.reader.nextLine();
        reader.close();
        return userInput;

    }

    public String getStringFromUser(String regex){
        String userInput = "";
        boolean answerIsCorrect = false;
        while (!answerIsCorrect){
            userInput = this.readString();
            if (validator.validateString(userInput) && validator.validateStringInRange(userInput, regex)){
                answerIsCorrect = true;
            }
        }
        return userInput;
    }

    public Integer getIntFromUser(int start, int end){
        String userInput = "";
        int userInteger = 0;
        boolean answerIsCorrect = false;
        while (!answerIsCorrect){
            userInput = this.readString();
            if (validator.isNumeric(userInput)){
                userInteger = Integer.parseInt(userInput);
                if (validator.isNumberInRange(start, end, userInteger)){
                    answerIsCorrect = true;
                }
            }
        }
        return userInteger;
    }

    public Integer getUserCoordinates(){
        String userInput = "";
        boolean answerIsCorrect = false;
        while (!answerIsCorrect){
            userInput = this.readString();
            String[] splitInput = this.helper.splitCoordinates();
            if (validator.checkCoordinates(splitInput)){
                answerIsCorrect = true;
            }
        }
        int[] convertedCoordinates = this.helper.convertCoordinates(splitInput)
        return convertedCoordinates;
    }

    public int getMenuOption(int start, int end){

    }



}