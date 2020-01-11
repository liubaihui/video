package com.vip.video.repository.mapper;

import com.vip.video.repository.entity.Ball;
import com.vip.video.repository.entity.BallExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BallMapper {
    int countByExample(BallExample example);

    int deleteByExample(BallExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Ball record);

    int insertSelective(Ball record);

    List<Ball> selectByExample(BallExample example);

    List<Ball> selectAll();

    Ball selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Ball record, @Param("example") BallExample example);

    int updateByExample(@Param("record") Ball record, @Param("example") BallExample example);

    int updateByPrimaryKeySelective(Ball record);

    int updateByPrimaryKey(Ball record);
}