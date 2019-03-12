package org.javacream.training.aop.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;

@Aspect
public class AuditingAspect {
	
	@Around("execution(* org.javacream.training.aop..*.*(..))")
	public Object audit(ProceedingJoinPoint pjp) throws Throwable {
		MethodSignature methodSignature = (MethodSignature) pjp.getSignature();
		System.out.println("Calling " + methodSignature.getName());
		return pjp.proceed();
	}
}
