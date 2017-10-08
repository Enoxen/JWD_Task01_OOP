package by.tc.task01.service.validation;

/**
 * Created by Y50-70 on 07.10.2017.
 */
public class StringValidator {
    private StringValidator(){}

    public static boolean isValidString(Object value){
        return value instanceof String && !value.equals("") || value instanceof Character;
    }
}
