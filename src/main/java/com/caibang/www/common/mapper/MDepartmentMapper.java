package com.caibang.www.common.mapper;

import com.caibang.www.common.model.MDepartment;

public interface MDepartmentMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(MDepartment record);

    int insertSelective(MDepartment record);

    MDepartment selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(MDepartment record);

    int updateByPrimaryKey(MDepartment record);
}