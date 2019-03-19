public class Validator {
    public Validator() {

    }

    public boolean validateString(String input) {
        return !input.isBlank();
    }

    public boolean validateStringInRange(String input) {
        // test if input is of specified value
    }

    public boolean isNumeric(String input) {
        // test if input String is of numeric value
    }

    public boolean isNumberInRange(int start, int end, int input) {
        // test if int input is in range int start <-> int end
    }

    public boolean checkCoordinates(String[] coordinates) {
        // test coordinates given as String[2] 
    }
}