package com.test;

import com.test.bean.Student;
import com.test.bean.Teacher;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @create 2020-09-07
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {TestApplication.class})
public class TestApplicationTest implements ApplicationContextAware {

	private ApplicationContext applicationContext;


	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	@Test
	public void testImport() {
		Assert.assertNotNull(applicationContext.getBean(Student.class));
		Assert.assertNotNull(applicationContext.getBean(Teacher.class));
	}
}
