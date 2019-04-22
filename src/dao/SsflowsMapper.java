package dao;

import java.util.List;

import entity.Ssflows;

public interface SsflowsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ssflows record);

    int insertSelective(Ssflows record);

    Ssflows selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ssflows record);

    int updateByPrimaryKey(Ssflows record);
    
    List<Ssflows> selectAllflow();
}