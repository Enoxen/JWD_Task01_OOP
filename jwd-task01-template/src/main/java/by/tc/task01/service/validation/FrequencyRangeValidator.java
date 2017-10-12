package by.tc.task01.service.validation;

import by.tc.task01.service.ServiceCommand.ValidationCommand;

public class FrequencyRangeValidator implements ValidationCommand{
    public FrequencyRangeValidator(){}
    @Override
    public boolean execute(Object value){
        return isValidRange((String)value);
    }
    public static boolean isValidRange(String str){
        String[] frequencyArr;
        if(str.contains("-")) {
             frequencyArr = str.split("-");
        }
        else {
            return false;
        }
        if(frequencyArr.length == 2){
            try {
                return Double.parseDouble(frequencyArr[0]) > 0 && Double.parseDouble(frequencyArr[1]) > 0;
            }
            catch (NumberFormatException e){
                return false;
            }
        }
        else {
            return false;
        }
    }
}
