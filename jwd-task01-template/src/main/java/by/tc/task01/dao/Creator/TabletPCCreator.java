package by.tc.task01.dao.Creator;

import by.tc.task01.dao.Command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;
import java.util.List;

public class TabletPCCreator implements Command{
    public TabletPCCreator(){}
    @Override
    public Appliance execute(List<String> params){
        TabletPC obj = new TabletPC();
        obj.setBatteryCapacity(Integer.parseInt(params.get(0)));
        obj.setDisplayInches(Double.parseDouble(params.get(1)));
        obj.setMemoryRom(Integer.parseInt(params.get(2)));
        obj.setFlashMemoryCap(Integer.parseInt(params.get(3)));
        obj.setColor(params.get(4));
        return obj;
    }
}
