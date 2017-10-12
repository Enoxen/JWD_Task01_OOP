package by.tc.task01.dao.Creator;

import by.tc.task01.dao.Command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;

/**
 * Created by Y50-70 on 11.10.2017.
 */
public class TabletPCCreator implements Command{
    public TabletPCCreator(){}
    @Override
    public Appliance execute(String[] params){
        TabletPC obj = new TabletPC();
        obj.setBatteryCapacity(Integer.parseInt(params[0]));
        obj.setDisplayInches(Double.parseDouble(params[1]));
        obj.setMemoryRom(Integer.parseInt(params[2]));
        obj.setFlashMemoryCap(Integer.parseInt(params[3]));
        obj.setColor(params[4]);
        return obj;
    }
}
