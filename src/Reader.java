import java.util.*;

public class Reader {
    Scanner reader;
    Validator validator;
    ReaderHelper helper;
    View viewer;

    Public Reader(View viewer){
        this.reader = new Scanner(System.in);
        this.validator = new Validator();
        this.helper = new ReaderHelper();
        this.viewer = viewer;
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
            } else {
                viewer.printError("Provide valid input data");
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
                } else {
                    viewer.printError("Integer needs to be in range of " + start + " and " + end);
                }
            } else {
                viewer.printError("Input needs to be integer");
            }
        }
        return userInteger;
    }

    public Coordinates getUserCoordinates(){
        String userInput = "";
        boolean answerIsCorrect = false;
        while (!answerIsCorrect){
            userInput = this.readString();
            String[] splitInput = this.helper.splitCoordinates();
            if (validator.checkCoordinates(splitInput)){
                answerIsCorrect = true;
            } else {
                viewer.printError("Provide valid coordinates");
            }
        }
        int[] convertedCoordinates = this.helper.convertCoordinates(splitInput);
        Coordinates coordinates = new Coordinates(convertCoordinates[0], convertCoordinates[1]);
        return coordinates;
    }
    
}