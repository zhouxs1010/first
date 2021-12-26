package com.example.firstdemo.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "myFilter", urlPatterns = {"/testFilter", "/1234/*"})
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter初始化.....");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("进入Filter中了.....");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("离开Filter了.......");
    }

    @Override
    public void destroy() {
        System.out.println("Filter销毁.....");
    }


}
