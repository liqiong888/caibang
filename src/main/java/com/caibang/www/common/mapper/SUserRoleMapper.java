package com.caibang.www.common.mapper;

import com.caibang.www.common.model.SUserRole;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SUserRoleMapper {
    int deleteByPrimaryKey(Integer sId);

    int insert(SUserRole record);

    int insertSelective(SUserRole record);

    SUserRole selectByPrimaryKey(Integer sId);

    int updateByPrimaryKeySelective(SUserRole record);

    int updateByPrimaryKey(SUserRole record);
}