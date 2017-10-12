package by.tc.task01.dao.Creator;

import by.tc.task01.dao.Command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;

/**
 * Created by Y50-70 on 11.10.2017.
 */
public class SpeakersCreator implements Command{
    public SpeakersCreator(){}
    @Override
    public Appliance execute(String[] params){
        Speakers obj = new Speakers();
        obj.setPowerConsumption(Integer.parseInt(params[0]));
        obj.setNumberOfSpeakers(Integer.parseInt(params[1]));
        obj.setFrequencyRange(params[2]);
        obj.setCordLength(Double.parseDouble(params[3]));
        return obj;
    }
}
