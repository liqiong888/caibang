package com.caibang.www.filter;


import com.caibang.www.utils.RedisUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 自定义过滤器
 */

/**
 * @WebFilter注解为声明此类为filter，第一个参数为该filter起一个名字，第二个参数为说明要拦截的请求地址。
 */
@WebFilter(filterName = "myfilter", urlPatterns = "/*")
@Slf4j
public class MyFilter implements Filter {

    @Autowired
    RedisUtils redisUtils;


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("--------------->过滤器被创建<----------------");
    }

//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        HttpServletRequest httpServletRequest;
//        StringBuilder stringBuilder = new StringBuilder();
//        httpServletRequest = (HttpServletRequest) servletRequest;
//        StringBuffer requestURL = httpServletRequest.getRequestURL();
//        System.out.println("-------------->过滤器请求地址<------------" + requestURL);
//        if (!requestURL.toString().contains("localhost:2221")) {
//            servletRequest.getRequestDispatcher("/web_user/error").forward(servletRequest, servletResponse);
//        } else {
//            ServletInputStream inputStream = httpServletRequest.getInputStream();
//            int read = inputStream.read();
//            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, Charset.forName("UTF-8"));
//            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//            String line = bufferedReader.readLine();
//            while (line != null) {
//                stringBuilder.append(line);
//            }
//            System.out.println("-----------params------------" + stringBuilder.toString());
//
//            //防止流读取一次后就没有了, 所以需要将流继续写出去
//            httpServletRequest = (HttpServletRequest) servletRequest;
//            ServletRequest requestWrapper = new BodyReaderHttpServletRequestWrapper(httpServletRequest);
//            filterChain.doFilter(requestWrapper, servletResponse);
//        }
//    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest;
        httpServletRequest = (HttpServletRequest) servletRequest;

        HttpSession session = httpServletRequest.getSession();
        StringBuffer requestURL = httpServletRequest.getRequestURL();

        if (requestURL.toString().contains("localhost:2221")) {
            System.out.println("-------------->过滤器请求地址<------------" + requestURL);
            if (session.getAttribute("loginName") != null) {
                try {
                    String sessionId = (String) redisUtils.get(session.getAttribute("loginName").toString());
                    /**
                     * session+redis
                     * session共享   唯一登录
                     */
                    if (sessionId != null && sessionId.equals(session.getId())) {
                        filterChain.doFilter(httpServletRequest, servletResponse);
                    } else {
                        servletRequest.getRequestDispatcher("/web_user/error").forward(servletRequest, servletResponse);
                    }
                } catch (Exception e) {
                    log.error("{}{}", session.getAttribute("loginName"), e.getMessage());
                }

            } else {
                //这是一个错误的测试
                filterChain.doFilter(httpServletRequest, servletResponse);
            }
        } else {
            servletRequest.getRequestDispatcher("/web_user/error").forward(servletRequest, servletResponse);
        }
    }

    @Override
    public void destroy() {
        System.out.println("--------------->过滤器被销毁<------------------");
    }
}
