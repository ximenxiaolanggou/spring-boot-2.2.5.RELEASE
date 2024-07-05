package center.helloworld.spring.v4;

import center.helloworld.spring.condition.MyCondition;
import center.helloworld.spring.dao.PersonDao;
import center.helloworld.spring.service.UserService;
import org.springframework.context.annotation.*;

import java.util.Arrays;

/**
 * @author zhishun.cai
 * @create 2024/7/4
 * @note
 */
public class Case01 {

	@Bean
	@Conditional(MyCondition.class)
	public PersonDao person() {
		return new PersonDao();
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Case01.class);
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}
}
