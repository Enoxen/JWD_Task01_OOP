package by.tc.task01.dao.Creator;

import by.tc.task01.dao.Command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;
import java.util.List;

public class SpeakersCreator implements Command{
    public SpeakersCreator(){}
    @Override
    public Appliance execute(List<String> params){
        Speakers obj = new Speakers();
        obj.setPowerConsumption(Integer.parseInt(params.get(0)));
        obj.setNumberOfSpeakers(Integer.parseInt(params.get(1)));
        obj.setFrequencyRange(params.get(2));
        obj.setCordLength(Double.parseDouble(params.get(3)));
        return obj;
    }
}
