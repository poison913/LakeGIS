package dao;

import java.util.List;

import entity.Inning;

public interface InningMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Inning record);

    int insertSelective(Inning record);

    Inning selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Inning record);

    int updateByPrimaryKey(Inning record);
    
	List<Inning> ZhenList();
	
	List<Inning> Zhendata(String zhen);
}