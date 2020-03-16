package com.caibang.www.login.service;


import com.caibang.www.basicModel.Msg;
import com.caibang.www.customAop.LoginAop;
import com.caibang.www.login.mapper.UserLoginMapper;
import com.caibang.www.login.model.UserLoginReq;
import com.caibang.www.login.model.UserLoginRes;
import com.caibang.www.utils.RedisUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
@Slf4j
public class UserLoginServiceImp implements UserLoginService {

    @Autowired
    private UserLoginMapper userLoginMapper;
    @Autowired
    private RedisUtils redisUtils;

    /**
     * 测试前面demo
     */
    @LoginAop(module = "")
    @Override
    public Msg signIn(String loginName, String password, HttpServletRequest request) {
        System.out.println("---------method  ing----------------");
        UserLoginRes userLoginRes = userLoginMapper.selectByNamePss(loginName, password);
        if (userLoginRes == null) {
            return Msg.error("登录失败");
        }
        redisUtils.set(userLoginRes.getMid().toString(), request.getSession().getId());
        request.getSession().setAttribute("loginName", userLoginRes.getMid().toString());
        boolean b = redisUtils.set(userLoginRes.getMid().toString(), request.getSession().getId());
        log.info("redis 保存状态----->" + b);
        return Msg.success(userLoginRes);
    }

    @Override
    public Msg signUp(UserLoginReq userLoginReq) {
        return null;
    }

    @Override
    public Msg signOut(Integer userId, HttpServletRequest request) {
        if (userId == null) {
            return Msg.error("无参数");
        }
        boolean b = redisUtils.hasKey(userId.toString());
        if (b) {
            redisUtils.del(userId.toString());
        }
        return Msg.success();
    }
}
