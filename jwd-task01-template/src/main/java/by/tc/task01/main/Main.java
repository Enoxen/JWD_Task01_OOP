package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

public class Main {

	public static void main(String[] args) {
		Appliance appliance;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria<Oven> criteriaOven = new Criteria<Oven>();
		criteriaOven.add(Oven.CAPACITY, 3);
		criteriaOven.setApplianceType("Oven");
		appliance = service.find(criteriaOven);

		if(appliance != null) {
			PrintApplianceInfo.print(appliance);
		}
		else System.out.println("Ошибка запроса");

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria<Oven>();
		criteriaOven.add(Oven.HEIGHT, 200);
		criteriaOven.add(Oven.DEPTH, 300);
		criteriaOven.setApplianceType("Oven");
		appliance = service.find(criteriaOven);

		if(appliance != null) {
			PrintApplianceInfo.print(appliance);
		}
		else System.out.println("Ошибка запроса");

		//////////////////////////////////////////////////////////////////

		Criteria<TabletPC> criteriaTabletPC = new Criteria<TabletPC>();
		criteriaTabletPC.add(TabletPC.COLOR, "BLUE");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM, 8000);
		criteriaTabletPC.setApplianceType("TabletPC");
		appliance = service.find(criteriaTabletPC);

		if(appliance != null) {
			PrintApplianceInfo.print(appliance);
		}
		else System.out.println("Ошибка запроса");


		Criteria<TabletPC> criteria = new Criteria<TabletPC>();
		criteria.add(TabletPC.FLASH_MEMORY_CAPACITY,2);
		criteria.add(TabletPC.COLOR,"red");
		criteria.add(TabletPC.BATTERY_CAPACITY,3);
		criteria.setApplianceType("TabletPC");
		appliance = service.find(criteria);
		if(appliance != null) {
			PrintApplianceInfo.print(appliance);
		}
		else System.out.println("Ошибка запроса");

		Criteria<Laptop> criteriaLaptop = new Criteria<Laptop>();
		criteriaLaptop.add(Laptop.CPU, 1.2);
		criteriaLaptop.setApplianceType("Laptop");
		appliance = service.find(criteriaLaptop);

		if(appliance != null) {
			PrintApplianceInfo.print(appliance);
		}
		else System.out.println("Ошибка запроса");
	}

}
