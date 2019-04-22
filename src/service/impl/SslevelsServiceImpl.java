package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.SslevelsMapper;
import entity.Sslevels;
import service.SslevelsService;

@Service("SslevelsService")
public class SslevelsServiceImpl implements SslevelsService{

	@Autowired
	private SslevelsMapper  ssm;
	@Override
	public List<Sslevels> selectAlllevel() {
		// TODO Auto-generated method stub
		return ssm.selectAlllevel();
	}
	public SslevelsMapper getSsm() {
		return ssm;
	}
	public void setSsm(SslevelsMapper ssm) {
		this.ssm = ssm;
	}

}
