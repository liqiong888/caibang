package com.caibang.www.login.controller;


import com.caibang.www.basicModel.Msg;
import com.caibang.www.login.service.UserLoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@RequestMapping("/web_user")
public class UserLoginController {

    @Autowired
    private UserLoginService userLoginService;

    /**
     * 登录
     *
     * @param loginName
     * @param password
     * @param request
     * @return
     */
    @RequestMapping(value = "/signIn/{loginName}/{password}", method = RequestMethod.GET)
    public Msg signIn(@PathVariable("loginName") String loginName, @PathVariable("password") String password, HttpServletRequest request) {

        try {

            Msg msg = userLoginService.signIn(loginName, password, request);
            return msg;
        } catch (Exception e) {
            log.error("{}", e.getMessage());
            return Msg.error();

        }
    }

    /**
     * 过滤器重定向
     *
     * @return
     */
    @RequestMapping(value = "/error")
    public Msg requestError() {
        return Msg.error("请求失败");
    }

    /**
     * 退出登录
     *
     * @param userId
     * @param request
     * @return
     */
    @RequestMapping(value = "/signOut", method = RequestMethod.POST)
    public Msg signOut(@RequestBody Integer userId, HttpServletRequest request) {

        try {
            Msg msg = userLoginService.signOut(userId, request);
            return msg;
        } catch (Exception e) {
            log.error("{}", e.getMessage());
            return Msg.error();

        }
    }
}
