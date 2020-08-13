package com.test.listener;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;

/**
 * @create 2020-08-13
 */
@Order(1)
public class FirstListener implements ApplicationListener<ApplicationStartingEvent> {

	public void onApplicationEvent(ApplicationStartingEvent event) {
		System.out.println("FirstListener");
	}
}
