package com.caibang.www.common.mapper;

import com.caibang.www.common.model.SCompany;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SCompanyMapper {
    int deleteByPrimaryKey(Integer sId);

    int insert(SCompany record);

    int insertSelective(SCompany record);

    SCompany selectByPrimaryKey(Integer sId);

    int updateByPrimaryKeySelective(SCompany record);

    int updateByPrimaryKey(SCompany record);
}