package com.giousa.mybatisgenerator.core.mapper;

import com.giousa.mybatisgenerator.core.model.TBaby;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TBabyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TBaby record);

    int insertSelective(TBaby record);

    TBaby selectByPrimaryKey(@Param("id") Integer id);

    int updateByPrimaryKeySelective(TBaby record);

    int updateByPrimaryKey(TBaby record);
}