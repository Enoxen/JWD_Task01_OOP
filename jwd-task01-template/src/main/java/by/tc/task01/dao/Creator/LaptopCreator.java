package by.tc.task01.dao.Creator;

import by.tc.task01.dao.Command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;

import java.util.DoubleSummaryStatistics;

/**
 * Created by Y50-70 on 10.10.2017.
 */
public class LaptopCreator implements Command {
    public LaptopCreator(){}
    @Override
    public Appliance execute(String[] params){
        Laptop obj = new Laptop();
        obj.setBatteryCapacity(Double.parseDouble(params[0]));
        obj.setOs(params[1]);
        obj.setMemoryRom(Integer.parseInt(params[2]));
        obj.setSystemMemory(Integer.parseInt(params[3]));
        obj.setCpu(Double.parseDouble(params[4]));
        obj.setDisplayInches(Float.parseFloat(params[5]));
        return obj;
    }
}
