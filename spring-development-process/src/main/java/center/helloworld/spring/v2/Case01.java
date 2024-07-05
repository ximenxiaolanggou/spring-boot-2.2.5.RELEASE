package center.helloworld.spring.v2;

import center.helloworld.spring.controller.PersonController;
import center.helloworld.spring.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author zhishun.cai
 * @create 2024/7/4
 * @note
 */
public class Case01 {

	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("classpath:spring-v2.xml");

		PersonController personController = context.getBean(PersonController.class);
		System.out.println(personController);
	}
}
