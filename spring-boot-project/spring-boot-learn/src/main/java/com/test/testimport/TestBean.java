package com.test.testimport;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

/**
 * @create 2020-08-25
 */
public class TestBean implements EnvironmentAware {
	public void setEnvironment(Environment environment) {
		System.out.println("here");
	}
}
