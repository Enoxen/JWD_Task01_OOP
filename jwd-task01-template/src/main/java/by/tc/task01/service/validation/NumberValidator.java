package by.tc.task01.service.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Y50-70 on 07.10.2017.
 */
public class NumberValidator {
    private NumberValidator(){}
    public static  boolean isValidNumber(Object value){
        String valueType = value.getClass().getName();
        if(valueType.contains("Double")){
            if ((Double)value > 0.0D){
                return true;
            }
        }
        else if(valueType.contains("Float")){
            if((Float)value > 0.0F){
                return true;
            }
        }
        else if(valueType.contains("Integer")){
            if((Integer)value > 0){
                return true;
            }
        }
        else if(valueType.contains("String")){

            Pattern p1 = Pattern.compile("[^0-9]");
            Matcher m1 = p1.matcher((String)value);
            if(m1.matches()){
                System.out.println("suka");
                return false;
            }
            else {
                return true;
            }

        }
        return false;
    }
}

