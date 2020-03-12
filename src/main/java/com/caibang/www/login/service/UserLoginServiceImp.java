package com.caibang.www.login.service;


import com.caibang.www.BasicModel.Msg;
import com.caibang.www.login.dao.UserLoginMapper;
import com.caibang.www.login.model.UserLoginReq;
import com.caibang.www.login.model.UserLoginRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginServiceImp implements UserLoginService {

    @Autowired
    private UserLoginMapper userLoginMapper;

    @Override
    public Msg signIn(String loginName, String password) {

        Msg msg=new Msg();
        UserLoginRes userLoginRes = userLoginMapper.selectByNamePss(loginName, password);
        msg.setObj(userLoginRes);
        return msg;
    }

    @Override
    public Msg signUp(UserLoginReq userLoginReq) {
        return null;
    }

    @Override
    public Msg signOut(Integer userId) {
        return null;
    }
}