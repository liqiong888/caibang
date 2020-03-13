package com.caibang.www.common.mapper;

import com.caibang.www.common.model.MCompany;

public interface MCompanyMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(MCompany record);

    int insertSelective(MCompany record);

    MCompany selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(MCompany record);

    int updateByPrimaryKeyWithBLOBs(MCompany record);

    int updateByPrimaryKey(MCompany record);
}