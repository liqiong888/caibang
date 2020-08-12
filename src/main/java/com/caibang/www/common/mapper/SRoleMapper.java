package com.caibang.www.common.mapper;

import com.caibang.www.common.model.SRole;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SRoleMapper {
    int deleteByPrimaryKey(Integer sId);

    int insert(SRole record);

    int insertSelective(SRole record);

    SRole selectByPrimaryKey(Integer sId);

    int updateByPrimaryKeySelective(SRole record);

    int updateByPrimaryKey(SRole record);
}