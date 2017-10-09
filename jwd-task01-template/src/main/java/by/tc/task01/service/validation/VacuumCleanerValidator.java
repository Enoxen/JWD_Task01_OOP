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
            if(key.equals(SearchCriteria.VacuumCleaner.BAG_TYPE) && !StringValidator.isValidString(criteria.getAllCriteria().get(key))){
                return false;
            }
            if(key.equals(SearchCriteria.VacuumCleaner.CLEANING_WIDTH) && !NumberValidator.isValidNumber(criteria.getAllCriteria().get(key))){
                return false;
            }
            if(key.equals(SearchCriteria.VacuumCleaner.FILTER_TYPE) && !StringValidator.isValidString(criteria.getAllCriteria().get(key))){
                return false;
            }
            if(key.equals(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION) && !NumberValidator.isValidNumber(criteria.getAllCriteria().get(key))){
                return false;
            }
            if(key.equals(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION) && !NumberValidator.isValidNumber(criteria.getAllCriteria().get(key))){
                return false;
            }
            if(key.equals(SearchCriteria.VacuumCleaner.WAND_TYPE) && !StringValidator.isValidString(criteria.getAllCriteria().get(key))){
                return false;
            }
        }
        return true;
    }
}
