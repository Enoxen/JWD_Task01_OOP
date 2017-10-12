package by.tc.task01.dao.Creator;

import by.tc.task01.dao.Command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;

/**
 * Created by Y50-70 on 11.10.2017.
 */
public class OvenCreator implements Command {
    public OvenCreator(){}

    @Override
    public Appliance execute(String[] params){
        Oven obj = new Oven();
        obj.setPowerConsumption(Integer.parseInt(params[0]));
        obj.setWeight(Double.parseDouble(params[1]));
        obj.setCapacity(Integer.parseInt(params[2]));
        obj.setDepth(Double.parseDouble(params[3]));
        obj.setHeight(Double.parseDouble(params[4]));
        obj.setWidth(Double.parseDouble(params[5]));
        return obj;
    }

}
