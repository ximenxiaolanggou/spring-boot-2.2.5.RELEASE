package center.helloworld.spring.importbdregistar;

import center.helloworld.spring.importselector.Cache;
import center.helloworld.spring.importselector.Logger;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author zhishun.cai
 * @create 2024/7/4
 * @note
 */
public class MyImportBeanDefinitionRegistar implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		// 将需要注册的对象封装为 RootBeanDefinition 对象
 		RootBeanDefinition cache = new RootBeanDefinition(Cache.class);
		registry.registerBeanDefinition("cache",cache);

		RootBeanDefinition logger = new RootBeanDefinition(Logger.class);
		registry.registerBeanDefinition("logger",logger);
	}
}
