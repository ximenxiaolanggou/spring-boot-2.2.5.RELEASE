package org.springframework.boot.debug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.io.support.SpringFactoriesLoader;

import java.util.List;

/**
 * @author zhishun.cai
 * @create 2024/7/4
 * @note
 */

@SpringBootApplication
public class DebugApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DebugApp.class, args);
		List<String> names = SpringFactoriesLoader.loadFactoryNames(TestAutoConfig.class, DebugApp.class.getClassLoader());
		System.out.println(names);
	}
}
