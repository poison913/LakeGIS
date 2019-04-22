package dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.Rain;

public interface RainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rain record);

    int insertSelective(Rain record);

    Rain selectRainByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Rain record);

    int updateByPrimaryKey(Rain record);
    
    List<Rain> Allrain(Date yestoday);
    
    List<Rain> stationrain(@Param("name")String name,@Param("start")Date start,@Param("end")Date end) ;
    
    List<Rain> getrainstation();
}