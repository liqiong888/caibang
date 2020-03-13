package com.caibang.www.common.mapper;

import com.caibang.www.common.model.MUser;

public interface MUserMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(MUser record);

    int insertSelective(MUser record);

    MUser selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(MUser record);

    int updateByPrimaryKey(MUser record);
}