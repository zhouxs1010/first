package com.example.firstdemo.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //启动时，在控制台可以看到
        System.out.println("MyListener...init......已经启动了");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

        System.out.println("MyListener...destroyed......已经销毁了");
    }
}
