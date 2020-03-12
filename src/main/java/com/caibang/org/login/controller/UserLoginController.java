package com.caibang.org.login.controller;

import com.caibang.org.BasicModel.Msg;
import com.caibang.org.login.service.UserLoginServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/userWeb")
public class UserLoginController {

    @Autowired
    private UserLoginServiceImp userLoginServiceImp;

    @RequestMapping(value = "/signIn")
    public Msg signIn(String loginName, String password) {

        Msg msg = userLoginServiceImp.signIn(loginName, password);
        return msg;
    }
}
