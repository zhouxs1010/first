package com.example.firstdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan //启动时扫描servlet,filter,listener
public class FirstdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstdemoApplication.class, args);
        //List list = new LinkedList<String>();

    }

}
