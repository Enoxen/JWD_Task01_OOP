package by.tc.task01.service.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Y50-70 on 07.10.2017.
 */
public class NumberValidator {
    private NumberValidator(){}
    public static  boolean isValidNumber(Object value){
        try {
            String valueType = value.getClass().getName();
            if (value instanceof Number) {
                if (valueType.contains("Double")) {
                    if ((Double) value > 0.0D) {
                        return true;
                    }
                } else if (valueType.contains("Float")) {
                    if ((Float) value > 0.0F) {
                        return true;
                    }
                } else if (valueType.contains("Integer")) {
                    if ((Integer) value > 0) {
                        return true;
                    }
                }
            }
            else if (valueType.contains("String")) {
                try {
                    return Double.parseDouble((String) value) > 0;
                }
                catch (NumberFormatException e){
                    return false;
                }
            }
        }catch (ClassCastException e){
            return false;
    }
        return false;
    }
}

