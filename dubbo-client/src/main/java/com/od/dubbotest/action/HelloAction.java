package com.od.dubbotest.action;

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
		String str="<h1>这是Dubbo微服务消费端(springboot)</h1><h2>apollo分环境已经完成，先打包测试环境测试，然后将镜像贴到生产环境的yaml里</h2>";
		str+=helloService.hello(name);
		System.out.println("HelloService返回到结果:"+str);
		return str;
	}
}
