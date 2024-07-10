package org.springframework.boot.debug.listeners;

import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author zhishun.cai
 * @create 2024/7/5
 * @note
 */
public class MySpringApplicationListener implements ApplicationListener<ApplicationStartingEvent> {
	@Override
	public void onApplicationEvent(ApplicationStartingEvent applicationEvent) {
		System.out.println("MySpringApplicationListener ---> " + applicationEvent);
	}
}
