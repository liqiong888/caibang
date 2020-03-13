package com.caibang.www.common.mapper;

import com.caibang.www.common.model.MUserPasswordLog;

public interface MUserPasswordLogMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(MUserPasswordLog record);

    int insertSelective(MUserPasswordLog record);

    MUserPasswordLog selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(MUserPasswordLog record);

    int updateByPrimaryKey(MUserPasswordLog record);
}