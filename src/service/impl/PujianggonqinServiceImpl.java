package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.PujianggonqinMapper;
import entity.Pujianggonqin;
import service.PujianggonqinService;
@Service("pujianggonqinService")
public class PujianggonqinServiceImpl implements PujianggonqinService {
	@Autowired
	private PujianggonqinMapper  pujianggonqinMapper;
	@Override
	public Pujianggonqin selectByPrimaryKey(Integer gid) {
		// TODO Auto-generated method stub
		return pujianggonqinMapper.selectByPrimaryKey(gid);
	}
	@Override
	public List<Pujianggonqin> list() {
		// TODO Auto-generated method stub
		return pujianggonqinMapper.list();
	}

}
