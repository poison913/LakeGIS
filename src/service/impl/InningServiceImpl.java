package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.InningMapper;
import entity.Inning;
import service.InningService;

@Service("InningService")
public class InningServiceImpl implements InningService{
	@Autowired
	private InningMapper  im;

	@Override
	public List<Inning> ZhenList() {
		// TODO Auto-generated method stub
		return im.ZhenList();
	}

	@Override
	public List<Inning> Zhendata(String zhen) {
		// TODO Auto-generated method stub
		return im.Zhendata(zhen);
	}
}
