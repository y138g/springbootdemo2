package com.itgr.springbootdemo2.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class firstListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("listener init...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
