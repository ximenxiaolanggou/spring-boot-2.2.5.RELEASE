package center.helloworld.spring.v3;

import center.helloworld.spring.enable.EnableHelloWorld;
import center.helloworld.spring.service.StudentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * @author zhishun.cai
 * @create 2024/7/4
 * @note
 */

@Import(StudentService.class)
public class Case06 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Case06.class);
	}
}
