package com.caibang.org.login.dao;

import com.caibang.org.login.model.UserLoginRes;
import org.apache.ibatis.annotations.Param;
import org.mapstruct.Mapper;

@Mapper
public interface UserLoginMapper {


    UserLoginRes selectByNamePss(@Param("loginName") String loginName,@Param("password") String password);

}
