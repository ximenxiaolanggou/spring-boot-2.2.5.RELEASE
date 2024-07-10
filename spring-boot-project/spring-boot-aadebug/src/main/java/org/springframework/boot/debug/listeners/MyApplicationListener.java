package org.springframework.boot.debug.listeners;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author zhishun.cai
 * @create 2024/7/5
 * @note
 */
//@Component
public class MyApplicationListener implements ApplicationListener {
	@Override
	public void onApplicationEvent(ApplicationEvent applicationEvent) {
		System.out.println("MyApplicationListener ---> " + applicationEvent);

		List<?> a = new MyApplicationListener().a();
		Object o = a.get(1);
	}

	public List<?> a() {
		ArrayList list = new ArrayList();
		return list;
	}
}
