package com.caibang.www.web.login;


import com.caibang.www.common.basicModel.Msg;
import com.caibang.www.core.login.service.UserLoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@RequestMapping("/web_user")
public class UserLoginController {

    @Autowired
    private UserLoginService userLoginService;

    @RequestMapping(value = "/signIn/{loginName}/{password}",method = RequestMethod.GET)
    public Msg signIn(@PathVariable("loginName") String loginName,@PathVariable("password") String password , HttpServletRequest request) {
        Msg msg = new Msg();
        try {

             msg = userLoginService.signIn(loginName, password,request);
            return msg;
        }catch (Exception e){
            log.error("{}",e.getMessage());
            msg.setSuccess(false);
            msg.setMsg("异常");
            return msg ;

        }
    }
    @RequestMapping(value = "/error")
    public Msg requestError(){
        Msg msg = new Msg();
        msg.setSuccess(false);
        msg.setMsg("请求错误");
        return msg;
    }
}
