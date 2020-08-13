package com.test;

import com.test.initializer.FirstInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @create 2020-08-13
 */
@SpringBootApplication
public class TestApplication {

//	public static void main(String[] args) {
//		SpringApplication springApplication = new SpringApplication(TestApplication.class);
//		springApplication.addInitializers(new FirstInitializer());
//		springApplication.run(args);
//	}

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(TestApplication.class);
		springApplication.run(args);
	}

}
