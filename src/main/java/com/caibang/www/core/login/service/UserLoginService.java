package com.caibang.www.core.login.service;


import com.caibang.www.common.basicModel.Msg;
import com.caibang.www.core.login.dto.UserLoginDTO;

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
    Msg signUp(UserLoginDTO userLoginReq);

    /**
     * 用户退出
     *
     * @param userId
     * @return
     */
    Msg signOut(Integer userId , HttpServletRequest request);

}
