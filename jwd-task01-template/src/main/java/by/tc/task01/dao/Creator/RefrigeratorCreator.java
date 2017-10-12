package by.tc.task01.dao.Creator;

import by.tc.task01.dao.Command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;
import java.util.List;


public class RefrigeratorCreator implements Command{
    public RefrigeratorCreator(){}
    @Override
    public Appliance execute(List<String> params){
        Refrigerator obj = new Refrigerator();
        obj.setPowerConsumption(Integer.parseInt(params.get(0)));
        obj.setWeight(Double.parseDouble(params.get(1)));
        obj.setFreezerCapacity(Double.parseDouble(params.get(2)));
        obj.setOverallCapacity(Double.parseDouble(params.get(3)));
        obj.setHeight(Double.parseDouble(params.get(4)));
        obj.setWidth(Double.parseDouble(params.get(5)));
        return obj;
    }
}
