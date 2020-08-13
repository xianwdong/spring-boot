package com.test.listener;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;

/**
 * @create 2020-08-13
 */
@Order(2)
public class SecondListener implements ApplicationListener<ApplicationStartedEvent> {

	public void onApplicationEvent(ApplicationStartedEvent event) {
		System.out.println("SecondListener");
	}
}
