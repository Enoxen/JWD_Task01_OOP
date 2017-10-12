package by.tc.task01.dao.Creator;

import by.tc.task01.dao.Command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;
import java.util.List;

public class VacuumCleanerCreator implements Command {
    public VacuumCleanerCreator(){}
    @Override
    public Appliance execute(List<String> params){
        VacuumCleaner obj = new VacuumCleaner();
        obj.setPowerConsumption(Integer.parseInt(params.get(0)));
        obj.setFilterType(params.get(1));
        obj.setBagType(params.get(3));
        obj.setWandType(params.get(4));
        obj.setMotorSpeedRegulation(Integer.parseInt(params.get(5)));
        obj.setCleaningWidth(Integer.parseInt(params.get(6)));
        return obj;
    }
}
