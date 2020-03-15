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

@Service
@Slf4j
public class UserLoginServiceImp implements UserLoginService {

    @Autowired
    private UserLoginMapper userLoginMapper;
    @Autowired
    private RedisUtils redisUtils;

    @LoginAop(module = "")
    @Override
    public Msg signIn(String loginName, String password) {
        System.out.println("---------method  ing----------------");
        Msg msg = new Msg();
        UserLoginRes userLoginRes = userLoginMapper.selectByNamePss(loginName, password);
        if (userLoginRes == null) {
            msg.setMsg("请求失败");
            msg.setSuccess(false);
            return msg;
        }
        boolean b = redisUtils.set(userLoginRes.getMloginname(), userLoginRes.getMphone());
        log.info("redis 保存状态----->"+b);
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
