package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

/**
 * Created by Y50-70 on 08.10.2017.
 */
public class OvenValidator{
    private OvenValidator(){}
    public static <E> boolean isValidOven(Criteria<E> criteria){
        for(Object key : criteria.getAllCriteria().keySet()){
            if(key.equals(SearchCriteria.Oven.CAPACITY) && !NumberValidator.isValidNumber(criteria.getAllCriteria().get(key))){
                return false;
            }
            if(key.equals(SearchCriteria.Oven.DEPTH) && !NumberValidator.isValidNumber(criteria.getAllCriteria().get(key))){
                return false;
            }
            if(key.equals(SearchCriteria.Oven.HEIGHT) && !NumberValidator.isValidNumber(criteria.getAllCriteria().get(key))){
                return false;
            }
            if(key.equals(SearchCriteria.Oven.POWER_CONSUMPTION) && !NumberValidator.isValidNumber(criteria.getAllCriteria().get(key))){
                return false;
            }
            if(key.equals(SearchCriteria.Oven.WEIGHT) && !NumberValidator.isValidNumber(criteria.getAllCriteria().get(key))){
                return false;
            }
            if(key.equals(SearchCriteria.Oven.WIDTH) && !NumberValidator.isValidNumber(criteria.getAllCriteria().get(key))){
                return false;
            }
        }
        return true;
    }
}
