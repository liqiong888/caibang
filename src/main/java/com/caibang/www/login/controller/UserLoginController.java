package com.caibang.www.login.controller;


import com.caibang.www.basicModel.Msg;
import com.caibang.www.login.service.UserLoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/web_user")
public class UserLoginController {

    @Autowired
    private UserLoginService userLoginService;

    @RequestMapping(value = "/signIn/{loginName}/{password}",method = RequestMethod.GET)
    public Msg signIn(@PathVariable("loginName") String loginName,@PathVariable("password") String password) {
        Msg msg = new Msg();
        try {

             msg = userLoginService.signIn(loginName, password);
            return msg;
        }catch (Exception e){
            log.error("{}",e.getMessage());
            msg.setSuccess(false);
            msg.setMsg("异常");
            return msg ;

        }
    }
}
