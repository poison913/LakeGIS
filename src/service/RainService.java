package service;
import java.util.Date;
import java.util.List;

import entity.Rain;;

public interface RainService {
	  Rain selectRainByPrimaryKey(Integer gid);
	  List<Rain> Allrain(Date yestoday);
	  List<Rain> stationrain(String name,Date start,Date end);
	  List<Rain> getrainstation();
	  
}
