package by.tc.task01.dao.Creator;

import by.tc.task01.dao.Command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;

/**
 * Created by Y50-70 on 11.10.2017.
 */
public class VacuumCleanerCreator implements Command {
    public VacuumCleanerCreator(){}
    @Override
    public Appliance execute(String[] params){
        VacuumCleaner obj = new VacuumCleaner();
        obj.setPowerConsumption(Integer.parseInt(params[0]));
        obj.setFilterType(params[1]);
        obj.setBagType(params[2]);
        obj.setWandType(params[3]);
        obj.setMotorSpeedRegulation(Integer.parseInt(params[4]));
        obj.setCleaningWidth(Integer.parseInt(params[5]));
        return obj;
    }
}
