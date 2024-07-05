package center.helloworld.spring.v1;

import center.helloworld.spring.entity.User;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author zhishun.cai
 * @create 2024/7/4
 * @note
 */
public class Case01 {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext context =
				new FileSystemXmlApplicationContext("classpath:spring.xml");

		User user = context.getBean(User.class);
		System.out.println(user);
	}
}
