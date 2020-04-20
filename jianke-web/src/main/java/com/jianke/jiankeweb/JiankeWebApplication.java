package com.jianke.jiankeweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.jianke")
@MapperScan("com.jianke.jiankedataaccess")
public class JiankeWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(JiankeWebApplication.class, args);
    }

}
