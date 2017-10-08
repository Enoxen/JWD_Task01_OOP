package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

/**
 * Created by Y50-70 on 08.10.2017.
 */
public class SpeakersValidator {
    private SpeakersValidator(){}
    public static <E> boolean isValidSpeakers(Criteria<E> criteria){
        for(Object key : criteria.getAllCriteria().keySet()){
            if(key.equals(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS)){
                return NumberValidator.isValidNumber(criteria.getAllCriteria().get(key));
            }
            if(key.equals(SearchCriteria.Speakers.CORD_LENGTH)){
                return NumberValidator.isValidNumber(criteria.getAllCriteria().get(key));
            }
            if(key.equals(SearchCriteria.Speakers.FREQUENCY_RANGE)){
                if(((String)criteria.getAllCriteria().get(key)).contains("-")){
                    String []frequencyStr = ((String) criteria.getAllCriteria().get(key)).split("-");
                    try {
                        if (Double.parseDouble(frequencyStr[0]) > 0 && Double.parseDouble(frequencyStr[1]) > 0){
                            return true;
                        }
                        else return false;
                    }
                    catch (NumberFormatException e){
                        e.printStackTrace();
                    }
                }
            }
            if(key.equals(SearchCriteria.Speakers.POWER_CONSUMPTION)){
                return NumberValidator.isValidNumber(criteria.getAllCriteria().get(key));
            }
        }
        return false;
    }
}
