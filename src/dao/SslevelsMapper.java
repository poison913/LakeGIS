package dao;

import java.util.List;

import entity.Sslevels;

public interface SslevelsMapper {
    int insert(Sslevels record);

    int insertSelective(Sslevels record);
    
	List<Sslevels> selectAlllevel();
}