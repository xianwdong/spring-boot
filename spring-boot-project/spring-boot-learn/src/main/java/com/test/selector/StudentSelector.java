package com.test.selector;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @create 2020-09-07
 */
public class StudentSelector implements DeferredImportSelector {

	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{"com.test.bean.Student"};
	}

}
