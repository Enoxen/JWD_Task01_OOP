package by.tc.task01.dao.Command;

import by.tc.task01.entity.Appliance;

/**
 * Created by Y50-70 on 10.10.2017.
 */
public interface Command {
     Appliance execute(String []params);
}
