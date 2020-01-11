package com.vip.video.repository.mapper;

import com.vip.video.repository.entity.OpenPrice;
import com.vip.video.repository.entity.OpenPriceExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface OpenPriceMapper {
    int countByExample(OpenPriceExample example);

    int deleteByExample(OpenPriceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OpenPrice record);

    int insertSelective(OpenPrice record);

    List<OpenPrice> selectByExample(OpenPriceExample example);

    OpenPrice selectByPrimaryKey(Integer id);
    OpenPrice selectAll();

    int updateByExampleSelective(@Param("record") OpenPrice record, @Param("example") OpenPriceExample example);

    int updateByExample(@Param("record") OpenPrice record, @Param("example") OpenPriceExample example);

    int updateByPrimaryKeySelective(OpenPrice record);

    int updateByPrimaryKey(OpenPrice record);
}