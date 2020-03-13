package com.caibang.www.common.mapper;

import com.caibang.www.common.model.MRoleGroup;

public interface MRoleGroupMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(MRoleGroup record);

    int insertSelective(MRoleGroup record);

    MRoleGroup selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(MRoleGroup record);

    int updateByPrimaryKey(MRoleGroup record);
}