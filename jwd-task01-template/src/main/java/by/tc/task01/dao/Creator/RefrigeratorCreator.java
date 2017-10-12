package by.tc.task01.dao.Creator;

import by.tc.task01.dao.Command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;

import java.sql.Ref;

/**
 * Created by Y50-70 on 11.10.2017.
 */
public class RefrigeratorCreator implements Command{
    public RefrigeratorCreator(){}
    @Override
    public Appliance execute(String[] params){
        Refrigerator obj = new Refrigerator();
        obj.setPowerConsumption(Integer.parseInt(params[0]));
        obj.setWeight(Double.parseDouble(params[1]));
        obj.setFreezerCapacity(Double.parseDouble(params[2]));
        obj.setOverallCapacity(Double.parseDouble(params[3]));
        obj.setHeight(Double.parseDouble(params[4]));
        obj.setWidth(Double.parseDouble(params[5]));
        return obj;
    }
}
