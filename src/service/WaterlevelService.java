package service;

import java.util.Date;
import java.util.List;

public interface WaterlevelService {
 List<entity.Waterlevel> stationlakelevel (Date start,Date end);
}
