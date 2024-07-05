package center.helloworld.spring.v3;

import center.helloworld.spring.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhishun.cai
 * @create 2024/7/4
 * @note
 */
@Configuration
public class JavaConfig {

	@Bean
	public UserService userService() {
		return new UserService();
	}
}
