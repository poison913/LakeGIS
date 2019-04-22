package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.SsflowsMapper;
import entity.Ssflows;
import service.SsflowsService;

@Service("SsflowsService")
public class SsflowsServiceImpl implements SsflowsService{
	@Autowired
	private SsflowsMapper  ssf;
	@Override
	public List<Ssflows> selectAllflow() {
		// TODO Auto-generated method stub
		return ssf.selectAllflow();
	}

}
