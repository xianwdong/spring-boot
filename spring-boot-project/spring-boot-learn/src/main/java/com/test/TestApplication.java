package com.test;

import com.test.selector.StudentSelector;
import com.test.selector.TeacherSelector;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * @create 2020-08-13
 */
@SpringBootApplication
@Import({TeacherSelector.class, StudentSelector.class})
public class TestApplication {

//	public static void main(String[] args) {
//		SpringApplication springApplication = new SpringApplication(TestApplication.class);
//		springApplication.addInitializers(new FirstInitializer());
//		springApplication.run(args);
//	}

//	public static void main(String[] args) {
//		SpringApplication springApplication = new SpringApplication(TestApplication.class);
//		springApplication.run(args);
//	}

}
