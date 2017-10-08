package by.tc.task01.service.validation;

import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

/**
 * Created by Y50-70 on 08.10.2017.
 */
public class RefrigeratorValidator {
    private RefrigeratorValidator(){}
    public static <E> boolean isValidRefrigerator(Criteria<E> criteria){
        for(Object key : criteria.getAllCriteria().keySet()){
            if(key.equals(SearchCriteria.Refrigerator.FREEZER_CAPACITY)){
                return NumberValidator.isValidNumber(criteria.getAllCriteria().get(key));
            }
            if(key.equals(SearchCriteria.Refrigerator.HEIGHT)){
                return NumberValidator.isValidNumber(criteria.getAllCriteria().get(key));
            }
            if(key.equals(SearchCriteria.Refrigerator.OVERALL_CAPACITY)){
                return NumberValidator.isValidNumber(criteria.getAllCriteria().get(key));
            }
            if(key.equals(SearchCriteria.Refrigerator.POWER_CONSUMPTION)){
                return NumberValidator.isValidNumber(criteria.getAllCriteria().get(key));
            }
            if(key.equals(SearchCriteria.Refrigerator.WEIGHT)){
                return NumberValidator.isValidNumber(criteria.getAllCriteria().get(key));
            }
            if(key.equals(SearchCriteria.Refrigerator.WIDTH)){
                return NumberValidator.isValidNumber(criteria.getAllCriteria().get(key));
            }
        }
        return false;
    }
}
