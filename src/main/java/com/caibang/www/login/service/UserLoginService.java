package com.caibang.www.login.service;


import com.caibang.www.basicModel.Msg;
import com.caibang.www.login.model.UserLoginReq;

import javax.servlet.http.HttpServletRequest;

public interface UserLoginService {

    /**
     * 用户登录
     *
     * @param loginName
     * @param password
     * @return
     */
    Msg signIn(String loginName, String password , HttpServletRequest request);

    /**
     * 用户注册
     *
     * @param userLoginReq
     * @return
     */
    Msg signUp(UserLoginReq userLoginReq);

    /**
     * 用户退出
     *
     * @param userId
     * @return
     */
    Msg signOut(Integer userId , HttpServletRequest request);

}
