package org.springframework.boot.debug.listeners;

import org.springframework.boot.debug.event.MyEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author zhishun.cai
 * @create 2024/7/10
 * @note
 */
public class MyEventListener implements ApplicationListener<MyEvent> {
	@Override
	public void onApplicationEvent(MyEvent event) {
		System.out.println("MyEventListener");
	}
}
