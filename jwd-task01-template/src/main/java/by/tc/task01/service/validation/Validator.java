package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ServiceCommand.ValidationDirector;

public class Validator {
	
	public static <E> boolean criteriaValidator(Criteria<E> criteria) {
		if(criteria == null || !criteria.getAllCriteria().keySet().iterator().hasNext()){
			return false;
		}
		ValidationDirector director = new ValidationDirector();
		for(Object key : criteria.getAllCriteria().keySet()){
			if(!director.getCommand(key.toString()).execute(criteria.getAllCriteria().get(key))){
				return false;
			}
		}
		return true;
	}
}