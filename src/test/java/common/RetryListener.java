package common;

import org.testng.IAnnotationTransformer;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;


public class RetryListener implements IAnnotationTransformer {
	
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod ) {
	
		annotation.setRetryAnalyzer(MyRetry.class);
	}
	
}
