package by.tc.task01.dao.Creator;

import by.tc.task01.dao.Command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import java.util.List;


public class LaptopCreator implements Command {
    public LaptopCreator(){}
    @Override
    public Appliance execute(List<String> params){
        Laptop obj = new Laptop();
        obj.setBatteryCapacity(Double.parseDouble(params.get(0)));
        obj.setOs(params.get(1));
        obj.setMemoryRom(Integer.parseInt(params.get(2)));
        obj.setSystemMemory(Integer.parseInt(params.get(3)));
        obj.setCpu(Double.parseDouble(params.get(4)));
        obj.setDisplayInches(Float.parseFloat(params.get(5)));
        return obj;
    }
}
