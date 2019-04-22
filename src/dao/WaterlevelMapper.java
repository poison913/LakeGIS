package dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.Waterlevel;

public interface WaterlevelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Waterlevel record);

    int insertSelective(Waterlevel record);

    Waterlevel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Waterlevel record);

    int updateByPrimaryKey(Waterlevel record);
    List<entity.Waterlevel> stationlakelevel (@Param("start")Date start,@Param("end")Date end);
}