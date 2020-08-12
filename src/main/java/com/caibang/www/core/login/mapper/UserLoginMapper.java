package com.caibang.www.core.login.mapper;

import com.caibang.www.common.model.SUser;
import com.caibang.www.core.login.dto.UserLoginDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserLoginMapper {

    SUser selectByName(@Param("loginName") String loginName);
}
