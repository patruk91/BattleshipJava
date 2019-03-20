import java.util.*;

public class Reader {
    private Scanner reader;
    private Validator validator;
    private ReaderHelper helper;
    private View viewer;

    public Reader(View viewer){
        this.reader = new Scanner(System.in);
        this.validator = new Validator();
        this.helper = new ReaderHelper();
        this.viewer = viewer;
    }

    private String readString(){
        return this.reader.nextLine();
    }


    public String getNameFromUser(String question){
        String userInput = "";
        boolean answerIsCorrect = false;
        while (!answerIsCorrect){
            this.viewer.printQuestion(question);
            userInput = this.readString();
            if (validator.validateString(userInput)){
                answerIsCorrect = true;
            } else {
                viewer.printError("Provide valid input data");
            }
        }
        return userInput;
    }

    public String getStringFromUser(String question, String regex){
        String userInput = "";
        boolean answerIsCorrect = false;
        while (!answerIsCorrect){
            this.viewer.printQuestion(question);
            userInput = this.readString();
            if (validator.validateString(userInput) && validator.validateStringInRange(userInput, regex)){
                answerIsCorrect = true;
            } else {
                viewer.printError("Provide valid input data");
            }
        }
        return userInput;
    }

    public Integer getIntFromUser(String question, int start, int end){
        String userInput = "";
        int userInteger = 0;
        boolean answerIsCorrect = false;
        while (!answerIsCorrect){
            this.viewer.printQuestion(question);
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

    public Coordinates getUserCoordinates(String question){
        String userInput = "";
        boolean answerIsCorrect = false;
        String[] splitInput = new String[2];
        while (!answerIsCorrect){
            this.viewer.printQuestion(question);
            userInput = this.readString();
            splitInput = this.helper.splitCoordinates(userInput);
            if (validator.checkCoordinates(splitInput)){
                answerIsCorrect = true;
            } else {
                viewer.printError("Provide valid coordinates");
            }
        }
        Coordinates coordinates = this.helper.convertCoordinates(splitInput);
        return coordinates;
    }
    
}