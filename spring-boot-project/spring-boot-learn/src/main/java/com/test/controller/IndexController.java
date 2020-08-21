package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @create 2020-08-14
 */
@RestController
public class IndexController {

	@GetMapping("/index")
	public String index() {
		return "hello world";
	}

}
