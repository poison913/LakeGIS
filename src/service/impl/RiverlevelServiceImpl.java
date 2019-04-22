package service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.RiverlevelMapper;
import entity.Riverlevel;
import service.RiverlevelService;

@Service("RiverlevelService")
public class RiverlevelServiceImpl implements RiverlevelService{
	@Autowired
	private RiverlevelMapper  riverlevelMapper;
	@Override
	public List<Riverlevel> AllRiverlevel(Date yestoday) {
		return riverlevelMapper.AllRiverlevel(yestoday);
	}
	@Override
	public List<Riverlevel> stationRiverlevel(String name, Date start, Date end) {
		// TODO Auto-generated method stub
		return riverlevelMapper.stationRiverlevel(name,start,end);
	}
	@Override
	public List<Riverlevel> getriverstation() {
		// TODO Auto-generated method stub
		return riverlevelMapper.getriverstation();
	}

}
