package com.test.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;

/**
 * @create 2020-08-13
 */
@Order(2)
public class SecondInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {


	public void initialize(ConfigurableApplicationContext applicationContext) {
		System.out.println("SecondInitializer");
	}
}
