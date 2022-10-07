package com.itgr.springbootdemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
//SpringBoot启动时扫描注册注解标注的Web组件
@ServletComponentScan
public class Springbootdemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(Springbootdemo2Application.class, args);
    }

}
