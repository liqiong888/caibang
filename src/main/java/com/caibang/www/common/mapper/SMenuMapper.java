package com.caibang.www.common.mapper;

import com.caibang.www.common.model.SMenu;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SMenuMapper {
    int deleteByPrimaryKey(Integer sId);

    int insert(SMenu record);

    int insertSelective(SMenu record);

    SMenu selectByPrimaryKey(Integer sId);

    int updateByPrimaryKeySelective(SMenu record);

    int updateByPrimaryKey(SMenu record);
}