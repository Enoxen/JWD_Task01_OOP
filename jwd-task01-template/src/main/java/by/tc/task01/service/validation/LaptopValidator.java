package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

/**
 * Created by Y50-70 on 08.10.2017.
 */
public class LaptopValidator {
    private LaptopValidator(){}

    public static <E> boolean isValidLaptop(Criteria<E> criteria){
        for (Object key : criteria.getAllCriteria().keySet()){
            if(key.equals(SearchCriteria.Laptop.BATTERY_CAPACITY)){
                return NumberValidator.isValidNumber(criteria.getAllCriteria().get(key));
            }
            if(key.equals(SearchCriteria.Laptop.CPU)){
                return NumberValidator.isValidNumber(criteria.getAllCriteria().get(key));
            }
            if(key.equals(SearchCriteria.Laptop.DISPLAY_INCHS)){
                return NumberValidator.isValidNumber(criteria.getAllCriteria().get(key));
            }
            if(key.equals(SearchCriteria.Laptop.MEMORY_ROM)){
                return NumberValidator.isValidNumber(criteria.getAllCriteria().get(key));
            }
            if(key.equals(SearchCriteria.Laptop.SYSTEM_MEMORY)){
                return  NumberValidator.isValidNumber(criteria.getAllCriteria().get(key));
            }
            if(key.equals(SearchCriteria.Laptop.OS)){
                return StringValidator.isValidString(criteria.getAllCriteria().get(key));
            }
        }
        return false;
    }
}
