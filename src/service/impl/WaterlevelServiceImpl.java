package service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.WaterlevelMapper;
import service.WaterlevelService;

@Service("WaterlevelService")
public class WaterlevelServiceImpl implements WaterlevelService{
	@Autowired
	private WaterlevelMapper  waterlevelMapper;
	@Override
	public List<entity.Waterlevel> stationlakelevel(Date start, Date end) {
		// TODO Auto-generated method stub
		return waterlevelMapper.stationlakelevel(start,end);
	}

}
