package center.helloworld.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhishun.cai
 * @create 2024/7/4
 * @note
 */
@Configuration
public class HelloWorldConfiguration {

 	@Bean
	public String helloWorld(){
		return "Hello World";
	}
}
