package com.caibang.www.common.mapper;

import com.caibang.www.common.model.SLoginLog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SLoginLogMapper {
    int deleteByPrimaryKey(Integer sId);

    int insert(SLoginLog record);

    int insertSelective(SLoginLog record);

    SLoginLog selectByPrimaryKey(Integer sId);

    int updateByPrimaryKeySelective(SLoginLog record);

    int updateByPrimaryKey(SLoginLog record);
}