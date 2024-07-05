package center.helloworld.spring.v3;

import center.helloworld.spring.controller.PersonController;
import center.helloworld.spring.dao.PersonDao;
import center.helloworld.spring.service.PersonService;
import center.helloworld.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhishun.cai
 * @create 2024/7/4
 * @note
 */

@ComponentScan
@Configuration
public class Case01 {

	@Bean
	public PersonDao person() {
		return new PersonDao();
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Case01.class);
		System.out.println(context.getBean(PersonDao.class));
		System.out.println(context.getBean(UserService.class));
	}
}
