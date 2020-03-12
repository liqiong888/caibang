package com.caibang.www.login.dao;


import com.caibang.www.login.model.UserLoginRes;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserLoginMapper {


    UserLoginRes selectByNamePss(@Param("loginName") String loginName, @Param("password") String password);

}
