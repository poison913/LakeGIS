package dao;

import java.util.List;

import entity.Pujianggonqin;

public interface PujianggonqinMapper {
    int deleteByPrimaryKey(Integer gid);

    int insert(Pujianggonqin record);

    int insertSelective(Pujianggonqin record);

    Pujianggonqin selectByPrimaryKey(Integer gid);

    int updateByPrimaryKeySelective(Pujianggonqin record);

    int updateByPrimaryKey(Pujianggonqin record);
    
    public List<Pujianggonqin>  list();
}