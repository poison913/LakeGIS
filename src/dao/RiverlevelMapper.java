package dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.Rain;
import entity.Riverlevel;

public interface RiverlevelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Riverlevel record);

    int insertSelective(Riverlevel record);

    Riverlevel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Riverlevel record);

    int updateByPrimaryKey(Riverlevel record);
    List<Riverlevel> AllRiverlevel(Date yestoday);
    
    List<Riverlevel> stationRiverlevel(@Param("name")String name,@Param("start")Date start,@Param("end")Date end) ;
    
	List<Riverlevel> getriverstation();
}