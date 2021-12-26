package com.example.firstdemo.configuration;

import com.example.firstdemo.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebConfig extends WebMvcConfigurationSupport {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 需要拦截的路径
        String[] addPathPatterns = {
                "/**"
        };
        //不需要拦截的路径
        String[] excludePathPatterns = {
                "/boot/hello", "boot/index"

        };

        //addPathPatterns()添加拦截路径
        //excludePathPatterns() 添加不拦截的路径
        //添加注册登录拦截器
        registry.addInterceptor(new MyInterceptor())
                .addPathPatterns(addPathPatterns);

        //如果有多个拦截器可以注册多个...
    }
}