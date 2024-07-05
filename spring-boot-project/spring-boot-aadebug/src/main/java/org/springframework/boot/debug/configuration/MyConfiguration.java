package org.springframework.boot.debug.configuration;

import org.springframework.boot.debug.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhishun.cai
 * @create 2024/7/4
 * @note
 */
@Configuration
public class MyConfiguration {

	@Bean
	public User user() {
		return new User();
	}
}
