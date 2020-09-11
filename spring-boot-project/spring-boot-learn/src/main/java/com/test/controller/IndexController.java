package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @create 2020-08-14
 */
@RestController
public class IndexController {

	@Autowired
	private Environment environment;

	@GetMapping("/index")
	public String index() {
		/**
		 * 测试加的参数
		 * vm参数 -Dspring.profiles.active=dev,test -Dhello3=world3
		 * program arguments
		 * --hello2=world2
		 * --spring.application.json={\"foo\":\"bar\"}
		 * --spring.proflies.active=test
		 * */
		System.out.println(environment.getProperty("hello"));
		System.out.println(environment.getProperty("hello3"));
		System.out.println(environment.getProperty("profile"));
		System.out.println(environment.getProperty("profile2"));
		return "hello world";
	}

}
