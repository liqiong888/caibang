package com.caibang.www.config.interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author lq
 * @className InterceptorConfig
 * @description 拦截器配置组件
 * @date 2020/3/1516:58
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Bean
    public LoginInterceptor getInterceptorLoginInterceptor() {
        return new LoginInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        /**
         *  多个拦截器组成一个拦截器链
         *  addPathPatterns 用于添加拦截规则
         *  excludePathPatterns 用户排除拦截
         */

        registry.addInterceptor(getInterceptorLoginInterceptor()).addPathPatterns("/api/**");
    }
}
