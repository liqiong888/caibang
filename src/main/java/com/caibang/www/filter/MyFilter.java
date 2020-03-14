package com.caibang.www.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 自定义过滤器
 */

/**
 * @WebFilter注解为声明此类为filter，第一个参数为该filter起一个名字，第二个参数为说明要拦截的请求地址。
 */
@WebFilter(filterName = "myfilter", urlPatterns = "/*")
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("--------------->过滤器被创建<----------------");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        StringBuffer requestURL = httpServletRequest.getRequestURL();
        System.out.println("-------------->过滤器请求地址<------------" + requestURL);
        if (!requestURL.toString().contains("signIn")) {
            servletRequest.getRequestDispatcher("/web_user/error").forward(servletRequest, servletResponse);
        } else {
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }

    @Override
    public void destroy() {
        System.out.println("--------------->过滤器被销毁<------------------");
    }
}
