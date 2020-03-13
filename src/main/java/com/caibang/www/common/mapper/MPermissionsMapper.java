package com.caibang.www.common.mapper;

import com.caibang.www.common.model.MPermissions;

public interface MPermissionsMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(MPermissions record);

    int insertSelective(MPermissions record);

    MPermissions selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(MPermissions record);

    int updateByPrimaryKey(MPermissions record);
}