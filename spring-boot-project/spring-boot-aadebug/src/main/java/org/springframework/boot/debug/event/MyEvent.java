package org.springframework.boot.debug.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author zhishun.cai
 * @create 2024/7/10
 * @note
 */
public class MyEvent extends ApplicationEvent {
	/**
	 * Create a new {@code ApplicationEvent}.
	 *
	 * @param source the object on which the event initially occurred or with
	 *               which the event is associated (never {@code null})
	 */
	public MyEvent(Object source) {
		super(source);
		System.out.println("MyEvent ~~");
	}
}
