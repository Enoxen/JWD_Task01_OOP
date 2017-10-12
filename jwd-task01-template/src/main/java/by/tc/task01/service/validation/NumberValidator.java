package by.tc.task01.service.validation;

import by.tc.task01.service.ServiceCommand.ValidationCommand;

/**
 * Created by Y50-70 on 12.10.2017.
 */
public class NumberValidator implements ValidationCommand{
    public NumberValidator(){}

    @Override
    public boolean execute(Object value){
        return isValidNumber(value);
    }
    public  boolean isValidNumber(Object value){
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

