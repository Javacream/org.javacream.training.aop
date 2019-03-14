package org.javacream.training.aop.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;

@Aspect
public class TracingAspect{

	@Around("execution(* org.javacream.training.aop..*Impl.*(..))")
	public Object trace(ProceedingJoinPoint pjp) throws Throwable {

		MethodSignature methodSignature = (MethodSignature) pjp.getSignature();
		String methodName = methodSignature.getMethod().getName();
		System.err.println("TRACING: entering " + methodName);
		try {
			Object result = pjp.proceed();
			System.err.println("TRACING: returning from " + methodName);
			return result;
		} catch (Throwable e) {
			System.err.println("TRACING: throwing from " + methodName);
			throw e;
		}
	}
	
}
