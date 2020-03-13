package com.caibang.www.common.mapper;

import com.caibang.www.common.model.MUserMail;

public interface MUserMailMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(MUserMail record);

    int insertSelective(MUserMail record);

    MUserMail selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(MUserMail record);

    int updateByPrimaryKey(MUserMail record);
}