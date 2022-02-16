package com.giousa.mybatisgenerator.core.mapper;

import com.giousa.mybatisgenerator.core.model.TBaby;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TBabyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TBaby record);

    int insertSelective(TBaby record);

    TBaby selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TBaby record);

    int updateByPrimaryKey(TBaby record);
}