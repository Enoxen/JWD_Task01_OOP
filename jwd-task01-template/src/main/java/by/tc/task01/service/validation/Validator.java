package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

public class Validator {
	
	public static <E> boolean criteriaValidator(Criteria<E> criteria) {
		if(criteria == null || !criteria.getAllCriteria().keySet().iterator().hasNext()){
			return false;
		}
		String criteriaType = criteria.getAllCriteria().keySet().iterator().next().getClass().getName();
		if(criteriaType.contains("SearchCriteria$Laptop") && !LaptopValidator.isValidLaptop(criteria)) {
			return false;
		}
		else if(criteriaType.contains("SearchCriteria$Oven") && !OvenValidator.isValidOven(criteria)){
			return false;
		}
		else if(criteriaType.contains("SearchCriteria$Refrigerator") && !RefrigeratorValidator.isValidRefrigerator(criteria)){
			return false;
		}
		else if(criteriaType.contains("SearchCriteria$Speakers") && !SpeakersValidator.isValidSpeakers(criteria)){
			return false;
		}
		else if(criteriaType.contains("SearchCriteria$TabletPC") && !TabletPCValidator.isValidTabletPC(criteria)){
			return false;
		}
		else if(criteriaType.contains("SearchCriteria$VacuumCleaner") && !VacuumCleanerValidator.isValidVacuumCleaner(criteria) ){
			return false;
		}
		return true;
	}
}