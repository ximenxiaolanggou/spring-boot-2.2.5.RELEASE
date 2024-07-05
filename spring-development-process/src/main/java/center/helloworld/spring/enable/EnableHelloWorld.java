package center.helloworld.spring.enable;

import center.helloworld.spring.configuration.HelloWorldConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 定义@Enable注解
 * 在该注解中通过 @Import 注解导入我们自定义的模块，使之生效。
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(HelloWorldConfiguration.class)
public @interface EnableHelloWorld {
}