package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ApplianceDAOImpl implements ApplianceDAO{

	@Override
	public <E> Appliance find(Criteria<E> criteria) {
		String objectStr = "";
		String criteriaType = criteria.getAllCriteria().keySet().iterator().next().getClass().getName();
		//System.out.println(criteriaType);
		Scanner scan;
		try {
			FileReader file = new FileReader("D:\\Programming\\Курсы\\JWD_Task01_OOP\\jwd-task01-template\\src\\main\\resources\\appliances_db.txt");
			scan = new Scanner(file);
			while (scan.hasNext()) {
				objectStr = scan.nextLine();
				if (objectStr.contains("Laptop")){
					if(criteriaType.contains("SearchCriteria$Laptop")){

					}
				}

			}
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}
		return null;
	}
	
	// you may add your own code here

}


//you may add your own new classes