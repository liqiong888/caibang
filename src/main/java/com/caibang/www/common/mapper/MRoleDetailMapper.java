package com.caibang.www.common.mapper;

import com.caibang.www.common.model.MRoleDetail;

public interface MRoleDetailMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(MRoleDetail record);

    int insertSelective(MRoleDetail record);

    MRoleDetail selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(MRoleDetail record);

    int updateByPrimaryKey(MRoleDetail record);
}