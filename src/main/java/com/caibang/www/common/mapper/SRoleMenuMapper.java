package com.caibang.www.common.mapper;

import com.caibang.www.common.model.SRoleMenu;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SRoleMenuMapper {
    int deleteByPrimaryKey(Integer sId);

    int insert(SRoleMenu record);

    int insertSelective(SRoleMenu record);

    SRoleMenu selectByPrimaryKey(Integer sId);

    int updateByPrimaryKeySelective(SRoleMenu record);

    int updateByPrimaryKey(SRoleMenu record);
}