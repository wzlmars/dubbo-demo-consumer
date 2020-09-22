package com.od.dubbotest;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * @ClassName ServletInitializer
 * @Description TODO
 * @Author rainbow
 * @CreateTime 2020年09月02日 09:25:59
 * @Version 1.0
 */
public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }
}