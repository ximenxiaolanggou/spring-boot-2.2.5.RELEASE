package center.helloworld.spring.importselector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author zhishun.cai
 * @create 2024/7/4
 * @note
 */

public class MyImportSelector implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata annotationMetadata) {
		return new String[] {Cache.class.getName(), Logger.class.getName()};
	}
}
