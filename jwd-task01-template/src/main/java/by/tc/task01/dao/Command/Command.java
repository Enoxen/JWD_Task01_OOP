package by.tc.task01.dao.Command;

import by.tc.task01.entity.Appliance;

import java.util.List;


public interface Command {
     Appliance execute(List<String> params);
}
