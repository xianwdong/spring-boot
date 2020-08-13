package com.test.listener;

import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;

/**
 * @create 2020-08-13
 */
public class ThirdListener implements SmartApplicationListener {
	public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
		return ApplicationStartingEvent.class.isAssignableFrom(eventType) || ApplicationPreparedEvent.class.isAssignableFrom(eventType);
	}

	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("ThirdListener");
	}

	public int getOrder() {
		return 3;
	}
}
