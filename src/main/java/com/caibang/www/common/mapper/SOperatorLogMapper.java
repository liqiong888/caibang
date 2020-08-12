package com.caibang.www.common.mapper;

import com.caibang.www.common.model.SOperatorLog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SOperatorLogMapper {
    int deleteByPrimaryKey(Integer sId);

    int insert(SOperatorLog record);

    int insertSelective(SOperatorLog record);

    SOperatorLog selectByPrimaryKey(Integer sId);

    int updateByPrimaryKeySelective(SOperatorLog record);

    int updateByPrimaryKeyWithBLOBs(SOperatorLog record);

    int updateByPrimaryKey(SOperatorLog record);
}