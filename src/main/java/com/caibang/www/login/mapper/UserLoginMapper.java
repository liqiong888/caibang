package com.caibang.www.login.mapper;


import com.caibang.www.login.model.UserLoginRes;
import org.apache.ibatis.annotations.Param;


public interface UserLoginMapper {

    /**
     * 用户名密码登录
     *
     * @param loginName
     * @param password
     * @return
     */
    UserLoginRes selectByNamePss(@Param("loginName") String loginName, @Param("password") String password);

//    Integer insertUser();

}
