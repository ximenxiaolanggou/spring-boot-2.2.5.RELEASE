package center.helloworld.spring.v3;

import center.helloworld.spring.dao.PersonDao;
import center.helloworld.spring.service.UserService;
import org.springframework.context.annotation.*;

/**
 * @author zhishun.cai
 * @create 2024/7/4
 * @note
 */

@Import(UserService.class)
public class Case02 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Case02.class);
		System.out.println(context.getBean(UserService.class));
	}
}
