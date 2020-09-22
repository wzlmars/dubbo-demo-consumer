package com.od.dubbotest.action;

<<<<<<< HEAD
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
        String str = "<h1>这是Dubbo 消费者端 - Tomcat版</h1>";
        str += helloService.hello(name);
        System.out.println("HelloService返回到结果:" + str);
        return str;
    }
=======
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.od.dubbotest.api.HelloService;

@RestController
@RequestMapping(value="/hello")
public class HelloAction {
	
	@Reference HelloService helloService;
	
	@RequestMapping
	public String say(String name) {
		System.out.println("HelloAction接收到请求:"+name);
		String str="<h1>这是Dubbo 消费者端(springboot)</h1>";
		str+="<h2>学好kubernetes走遍天下都不怕</h2>";
		str+=helloService.hello(name);
		System.out.println("HelloService返回到结果:"+str);
		return str;
	}
>>>>>>> 19f9406cc77169f0390b2209bafed811223107bc
}
