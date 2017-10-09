package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

/**
 * Created by Y50-70 on 08.10.2017.
 */
public class TabletPCValidator {
    private TabletPCValidator(){}

    public static <E> boolean isValidTabletPC(Criteria<E> criteria){
        for(Object key : criteria.getAllCriteria().keySet()){
            if(key.equals(SearchCriteria.TabletPC.BATTERY_CAPACITY) && !NumberValidator.isValidNumber(criteria.getAllCriteria().get(key))){
                return false;
            }
            if(key.equals(SearchCriteria.TabletPC.COLOR) && !StringValidator.isValidString(criteria.getAllCriteria().get(key))){
                return false;
            }
            if(key.equals(SearchCriteria.TabletPC.DISPLAY_INCHES) && !NumberValidator.isValidNumber(criteria.getAllCriteria().get(key))){
                return false;
            }
            if(key.equals(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY) && !NumberValidator.isValidNumber(criteria.getAllCriteria().get(key))){
                return false;
            }
            if(key.equals(SearchCriteria.TabletPC.MEMORY_ROM) && !NumberValidator.isValidNumber(criteria.getAllCriteria().get(key))){
                return false;
            }
        }
        return true;
    }
}
