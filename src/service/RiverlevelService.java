package service;

import java.util.Date;
import java.util.List;

import entity.Riverlevel;;

public interface RiverlevelService {
	List<Riverlevel> AllRiverlevel(Date yestoday);
	List<Riverlevel> getriverstation();
	List<Riverlevel> stationRiverlevel(String name,Date start,Date end);
}
