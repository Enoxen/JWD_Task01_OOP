package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

/**
 * Created by Y50-70 on 08.10.2017.
 */
public class VacuumCleanerValidator {
    private VacuumCleanerValidator(){}
    public static <E> boolean isValidVacuumCleaner(Criteria<E> criteria){
        for(Object key : criteria.getAllCriteria().keySet()){
            if(key.equals(SearchCriteria.VacuumCleaner.BAG_TYPE)){
                return StringValidator.isValidString(criteria.getAllCriteria().get(key));
            }
            if(key.equals(SearchCriteria.VacuumCleaner.CLEANING_WIDTH)){
                return NumberValidator.isValidNumber(criteria.getAllCriteria().get(key));
            }
            if(key.equals(SearchCriteria.VacuumCleaner.FILTER_TYPE)){
                return StringValidator.isValidString(criteria.getAllCriteria().get(key));
            }
            if(key.equals(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION)){
                return NumberValidator.isValidNumber(criteria.getAllCriteria().get(key));
            }
            if(key.equals(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION)){
                return NumberValidator.isValidNumber(criteria.getAllCriteria().get(key));
            }
            if(key.equals(SearchCriteria.VacuumCleaner.WAND_TYPE)){
                return StringValidator.isValidString(criteria.getAllCriteria().get(key));
            }
        }
        return false;
    }
}
