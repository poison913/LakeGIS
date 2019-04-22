package service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.RainMapper;
import entity.Rain;
import service.RainService;
@Service("RainService")
public class RainServiceImpl implements RainService {
	@Autowired
	private RainMapper  rainMapper;
	@Override
	public Rain selectRainByPrimaryKey(Integer gid) {
		// TODO Auto-generated method stub
		return rainMapper.selectRainByPrimaryKey(gid);
	}
	@Override
	public List<Rain> Allrain(Date yestoday) {
		// TODO Auto-generated method stub
		return rainMapper.Allrain(yestoday);
	}
	@Override
	public List<Rain> stationrain(String name,Date start,Date end) {
		// TODO Auto-generated method stub
		return rainMapper.stationrain(name, start, end);
	}
	@Override
	public List<Rain> getrainstation() {
		// TODO Auto-generated method stub
		return rainMapper.getrainstation();
	}

}
