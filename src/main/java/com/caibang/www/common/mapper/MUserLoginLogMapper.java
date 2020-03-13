package com.caibang.www.common.mapper;

import com.caibang.www.common.model.MUserLoginLog;

public interface MUserLoginLogMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(MUserLoginLog record);

    int insertSelective(MUserLoginLog record);

    MUserLoginLog selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(MUserLoginLog record);

    int updateByPrimaryKey(MUserLoginLog record);
}