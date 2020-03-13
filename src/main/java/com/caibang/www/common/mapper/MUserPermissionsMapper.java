package com.caibang.www.common.mapper;

import com.caibang.www.common.model.MUserPermissions;

public interface MUserPermissionsMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(MUserPermissions record);

    int insertSelective(MUserPermissions record);

    MUserPermissions selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(MUserPermissions record);

    int updateByPrimaryKey(MUserPermissions record);
}