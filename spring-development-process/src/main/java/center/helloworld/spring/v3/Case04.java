package center.helloworld.spring.v3;

import center.helloworld.spring.importbdregistar.MyImportBeanDefinitionRegistar;
import center.helloworld.spring.importselector.Cache;
import center.helloworld.spring.importselector.Logger;
import center.helloworld.spring.importselector.MyImportSelector;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * @author zhishun.cai
 * @create 2024/7/4
 * @note
 */

@Import(MyImportBeanDefinitionRegistar.class)
public class Case04 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Case04.class);
		System.out.println(context.getBean(Logger.class));
		System.out.println(context.getBean(Cache.class));
	}
}
