package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

public class Validator {
	
	public static <E> boolean criteriaValidator(Criteria<E> criteria) {
		if(criteria == null || !criteria.getAllCriteria().keySet().iterator().hasNext()){
			return false;
		}
		String criteriaType = criteria.getAllCriteria().keySet().iterator().next().getClass().getName();
		if(criteriaType.contains("SearchCriteria$Laptop") && LaptopValidator.isValidLaptop(criteria))
		{
			System.out.println("Laptop");
		}
		else if(criteriaType.contains("SearchCriteria$Oven")){
			System.out.println("Oven");
		}
		else if(criteriaType.contains("SearchCriteria$Refrigerator")){
			System.out.println("Refrigerator");
		}
		else if(criteriaType.contains("SearchCriteria$Speakers")){
			System.out.println("Speakers");
		}
		else if(criteriaType.contains("SearchCriteria$TabletPC")){
			System.out.println("TabletPC");
		}
		else if(criteriaType.contains("SearchCriteria$VacuumCleaner")){
			System.out.println("VacuumCleaner");
		}
		else {
			System.out.println("kek");
		}
		return true;
	}
}
//you may add your own new classes