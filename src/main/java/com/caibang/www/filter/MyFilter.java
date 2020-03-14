package com.caibang.www.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

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
        StringBuffer requestURL = httpServletRequest.getRequestURL();
        System.out.println("-------------->过滤器请求地址<------------" + requestURL);
        if (!requestURL.toString().contains("localhost:2221")) {
            servletRequest.getRequestDispatcher("/web_user/error").forward(servletRequest, servletResponse);
        } else {

            filterChain.doFilter(httpServletRequest, servletResponse);
        }
    }

    @Override
    public void destroy() {
        System.out.println("--------------->过滤器被销毁<------------------");
    }
}
