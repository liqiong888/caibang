package com.caibang.org.login.service;

import com.caibang.org.BasicModel.Msg;
import com.caibang.org.login.model.UserLoginReq;
import com.caibang.org.login.model.UserLoginRes;

public interface UserLoginService {

    /**
     * 用户登录
     *
     * @param loginName
     * @param password
     * @return
     */
    Msg signIn(String loginName, String password);

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
    Msg signOut(Integer userId);

}
