package by.tc.task01.service.validation;

import by.tc.task01.service.ServiceCommand.ValidationCommand;

public class StringValidator implements ValidationCommand{
        public StringValidator(){}
        @Override
        public boolean execute(Object value){
            return isValidString(value);
        }
        public boolean isValidString(Object value){
            return value instanceof String && !value.equals("") || value instanceof Character;
        }
    }

