package com.test.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;

/**
 * @create 2020-08-13
 */
@Order(1)
public class FirstInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

	public void initialize(ConfigurableApplicationContext applicationContext) {
		System.out.println("FirstInitializer");
	}
}
