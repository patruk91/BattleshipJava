public class Validator {
    private final String LETTER_COORDS_REGEX = "[abcdefghij]{1}";
    private final String DIRECTION_REGEX = "[hv]{1}";

    
    public Validator() {

    }

    public boolean validateString(String input) {
        return !input.isBlank();
    }

    public boolean validateStringInRange(String input, String regex) {
        if (input.matches(regex)) {
            return true;
        }
        return false;
    }

    public boolean isNumeric(String input) {
        if (input.matches("[\\d]+")) {
            return true;
        }
        return false;
    }

    public boolean isNumberInRange(int start, int end, int input) {
        if (start <= input && input <= end) {
            return true;
        }
        return false;
    }

    public boolean checkCoordinates(String[] coordinates) {
        boolean letterCoordinate = validateStringInRange(coordinates[0], LETTER_COORDS_REGEX);
        boolean numericCoordinate = false;
        if (isNumeric(coordinates[1])) {
            int tempNumericValue = Integer.parseInt(coordinates[1]);
            if (isNumberInRange(1, 10, tempNumericValue)) {
                numericCoordinate = true;
            }
        } 
        if (letterCoordinate && numericCoordinate) {
            return true;
        }
        return false;
    }
}