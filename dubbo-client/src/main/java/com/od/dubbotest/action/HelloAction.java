package com.od.dubbotest.action;

import com.alibaba.dubbo.config.annotation.Reference;
import com.od.dubbotest.api.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloAction {

    @Reference
    HelloService helloService;

    @RequestMapping
    public String say(String name) {
        System.out.println("HelloAction接收到请求:" + name);
        String str = "<h1>这是Dubbo 消费者端 - Tomcat版</h1><h2>spinnaker 服务CI/CD 自动化部署 1365339899</h2>";
        str += helloService.hello(name);
        System.out.println("HelloService返回到结果:" + str);
        return str;
    }
}
