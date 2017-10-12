package by.tc.task01.dao.Creator;

import by.tc.task01.dao.Command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;
import java.util.List;

public class OvenCreator implements Command {
    public OvenCreator(){}

    @Override
    public Appliance execute(List<String> params){
        Oven obj = new Oven();
        obj.setPowerConsumption(Integer.parseInt(params.get(0)));
        obj.setWeight(Double.parseDouble(params.get(1)));
        obj.setCapacity(Integer.parseInt(params.get(2)));
        obj.setDepth(Double.parseDouble(params.get(3)));
        obj.setHeight(Double.parseDouble(params.get(4)));
        obj.setWidth(Double.parseDouble(params.get(5)));
        return obj;
    }

}
