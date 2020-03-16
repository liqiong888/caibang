package com.caibang.www.interceptor;

import com.caibang.www.utils.RedisUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author lq
 * @className LoginInterceptor
 * @description 登录拦截器
 * @date 2020/3/1516:41
 */
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {

    @Autowired
    private RedisUtils redisUtils;

    /**
     * 在请求处理之前进行调用（Controller方法调用之前）
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("---------------->进入拦截器，在请求之前调用地址<--------------------"+request.getRequestURL());
        HttpSession session = request.getSession();
        try {
            if (session.getAttribute("mid") != null) {
                String seesionId = (String) redisUtils.get(session.getAttribute("mid").toString());
                if (seesionId != null && seesionId.equals(session.getId())) {
                    log.info("当前登录者的ID是{}，sessionId是{}",session.getAttribute("mid"),seesionId);
                    return true;
                }
            }
        } catch (Exception e) {
            log.error("{}",e.getMessage());
        }
        return false;
    }

    /**
     * 请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    /**
     * 在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
