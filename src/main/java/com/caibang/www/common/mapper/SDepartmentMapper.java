package com.caibang.www.common.mapper;

import com.caibang.www.common.model.SDepartment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SDepartmentMapper {
    int deleteByPrimaryKey(Integer sId);

    int insert(SDepartment record);

    int insertSelective(SDepartment record);

    SDepartment selectByPrimaryKey(Integer sId);

    int updateByPrimaryKeySelective(SDepartment record);

    int updateByPrimaryKey(SDepartment record);
}