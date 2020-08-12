package com.caibang.www.common.mapper;

import com.caibang.www.common.model.SUser;
import com.caibang.www.common.model.SUserKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SUserMapper {
    int deleteByPrimaryKey(SUserKey key);

    int insert(SUser record);

    int insertSelective(SUser record);

    SUser selectByPrimaryKey(SUserKey key);

    SUser selectByPrimaryKey2(@Param("id") Integer id);

    int updateByPrimaryKeySelective(SUser record);

    int updateByPrimaryKey(SUser record);
}