package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.Command.ApplianceDirector;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApplianceDAOImpl implements ApplianceDAO{

	@Override
	public <E> Appliance find(Criteria<E> criteria) {
		String applianceStr;
		String str = criteria.getApplianceType();
		Scanner scan = null;
		ApplianceDirector director = new ApplianceDirector();
		Appliance appliance;
		try {
			FileReader file = new FileReader(".\\src\\main\\resources\\appliances_db.txt");
			scan = new Scanner(file);
			while (scan.hasNext()) {
				applianceStr = scan.nextLine();
				if(isFound(applianceStr, criteria) && applianceStr.contains(str)) {
					appliance = director.getCommand(criteria.getApplianceType()).execute(parseObjectString(applianceStr));
					return appliance;
				}
			}
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}
		finally {
			if(scan != null){
				scan.close();
			}
		}
		return null;
	}
	private <E> boolean isFound(String applianceStr, Criteria<E> criteria){
		String strCriteria = "";
		String searchString = applianceStr.replace(';',',');
		for(Object key : criteria.getAllCriteria().keySet()){
			strCriteria = key.toString() + "=" + criteria.getAllCriteria().get(key).toString().toLowerCase() + ",";
			if(!searchString.contains(strCriteria)){
				return false;
			}
		}
		return true;
	}
	private List<String> parseObjectString(String applianceStr){
		List<String> parsedParams = new ArrayList<>();
		String str = "";
		for(int i = 0; i < applianceStr.length(); i++){
			if(applianceStr.charAt(i) == '='){
				int j = i + 1;
				str = "";
				while(applianceStr.charAt(j) != ',' && applianceStr.charAt(j) != ';') {
					str += applianceStr.charAt(j);
					j++;
				}
				i = j;
				parsedParams.add(str);
			}
		}
		return parsedParams;
	}
}