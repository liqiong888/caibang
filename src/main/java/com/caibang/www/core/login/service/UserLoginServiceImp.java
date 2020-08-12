package com.caibang.www.core.login.service;


import com.caibang.www.common.basicModel.Msg;
import com.caibang.www.common.mapper.SUserMapper;
import com.caibang.www.common.model.SUser;
import com.caibang.www.config.customAop.LoginAop;

import com.caibang.www.core.login.dto.UserLoginDTO;
import com.caibang.www.core.login.mapper.UserLoginMapper;
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
    private SUserMapper sUserMapper;
    @Autowired
    private RedisUtils redisUtils;

    @LoginAop(module = "")
    @Override
    public Msg signIn(String loginName, String password, HttpServletRequest request) {
        Msg msg = new Msg();
        SUser user = userLoginMapper.selectByName(loginName);
        redisUtils.set(user.getsId().toString(), request.getSession().getId());
        if (user == null) {
            msg.setMsg("request error");
            msg.setSuccess(false);
            return msg;
        }
        request.getSession().setAttribute("sid", user.getsId().toString());
        boolean b = redisUtils.set(user.getsId().toString(), request.getSession().getId());
        log.info("redis status :[{}]", b);
        msg.setObj(user);
        return msg;
    }

    @Override
    public Msg signUp(UserLoginDTO userLoginReq) {
        return null;
    }

    @Override
    public Msg signOut(Integer userId, HttpServletRequest request) {
        return null;
    }
}
