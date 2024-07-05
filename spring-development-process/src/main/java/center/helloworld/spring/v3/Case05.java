package center.helloworld.spring.v3;

import center.helloworld.spring.configuration.HelloWorldConfiguration;
import center.helloworld.spring.enable.EnableHelloWorld;
import center.helloworld.spring.importbdregistar.MyImportBeanDefinitionRegistar;
import center.helloworld.spring.importselector.Cache;
import center.helloworld.spring.importselector.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * @author zhishun.cai
 * @create 2024/7/4
 * @note
 */

@EnableHelloWorld
public class Case05 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Case05.class);
		System.out.println(context.getBean("helloWorld", String.class));
	}
}
