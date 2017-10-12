package by.tc.task01.dao.Command;

import by.tc.task01.dao.Creator.*;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

/**
 * Created by Y50-70 on 10.10.2017.
 */
public class ApplianceDirector {
    private Map<String, Command> map = new HashMap<>();
    ApplianceDirector(){
        map.put("Laptop", new LaptopCreator());
        map.put("Oven", new OvenCreator());
        map.put("Refrigerator", new RefrigeratorCreator());
        map.put("Speakers", new SpeakersCreator());
        map.put("VacuumCleaner", new VacuumCleanerCreator());
        map.put("TabletPC", new TabletPCCreator());
    }
    public Command getCommand(String commandType){
        Command command;
        command = map.get(commandType);
        return command;
    }
}
