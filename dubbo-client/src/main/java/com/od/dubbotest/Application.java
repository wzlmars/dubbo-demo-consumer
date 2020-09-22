package com.od.dubbotest;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@ImportResource(value = {"classpath*:spring-config.xml"})
public class Application {

    public static void main(String[] args) {
        System.out.println("Dubbo client started");
        System.out.println("Dubbo 消费者端启动");
    }

}