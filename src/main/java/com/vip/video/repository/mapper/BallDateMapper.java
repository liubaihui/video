package com.vip.video.repository.mapper;

import com.vip.video.repository.entity.BallDateExample;
import com.vip.video.repository.entity.BallDate;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BallDateMapper {
    int countByExample(BallDateExample example);

    int deleteByExample(BallDateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BallDate record);

    int insertSelective(BallDate record);

    List<BallDate> selectByExample(BallDateExample example);

    BallDate selectByPrimaryKey(Integer id);
    BallDate selectAll();

    int updateByExampleSelective(@Param("record") BallDate record, @Param("example") BallDateExample example);

    int updateByExample(@Param("record") BallDate record, @Param("example") BallDateExample example);

    int updateByPrimaryKeySelective(BallDate record);

    int updateByPrimaryKey(BallDate record);
}