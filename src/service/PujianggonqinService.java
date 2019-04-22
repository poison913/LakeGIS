package service;

import java.util.List;

import entity.Pujianggonqin;

public interface PujianggonqinService {
	  Pujianggonqin selectByPrimaryKey(Integer gid);
	  public List<Pujianggonqin>  list();
}
