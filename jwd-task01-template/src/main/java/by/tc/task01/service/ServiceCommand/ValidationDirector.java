package by.tc.task01.service.ServiceCommand;

import by.tc.task01.service.validation.FrequencyRangeValidator;
import by.tc.task01.service.validation.NumberValidator;
import by.tc.task01.service.validation.StringValidator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Y50-70 on 12.10.2017.
 */
public class ValidationDirector {
    private Map<String, ValidationCommand> map = new HashMap<>();

    public ValidationDirector(){
        map.put("BATTERY_CAPACITY", new NumberValidator());
        map.put("POWER_CONSUMPTION", new NumberValidator());
        map.put("WEIGHT", new NumberValidator());
        map.put("CAPACITY", new NumberValidator());
        map.put("DEPTH", new NumberValidator());
        map.put("HEIGHT", new NumberValidator());
        map.put("WIDTH", new NumberValidator());
        map.put("OS", new StringValidator());
        map.put("MEMORY_ROM", new NumberValidator());
        map.put("SYSTEM_MEMORY", new NumberValidator());
        map.put("CPU", new NumberValidator());
        map.put("DISPLAY_INCHS", new NumberValidator());
        map.put("FREEZER_CAPACITY", new NumberValidator());
        map.put("OVERALL_CAPACITY", new NumberValidator());
        map.put("FILTER_TYPE", new StringValidator());
        map.put("BAG_TYPE", new StringValidator());
        map.put("WAND_TYPE", new StringValidator());
        map.put("MOTOR_SPEED_REGULATION", new NumberValidator());
        map.put("CLEANING_WIDTH", new NumberValidator());
        map.put("FLASH_MEMORY_CAPACITY", new NumberValidator());
        map.put("COLOR", new StringValidator());
        map.put("NUMBER_OF_SPEAKERS", new NumberValidator());
        map.put("FREQUENCY_RANGE", new FrequencyRangeValidator());
        map.put("CORD_LENGTH", new NumberValidator());
        map.put("DISPLAY_INCHES", new NumberValidator());
    }
    public ValidationCommand getCommand(String criteriaType){
        ValidationCommand command = map.get(criteriaType);
        return command;
    }
}
