package org.javacream.training.aop.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.FieldSignature;

@Aspect
public class AttributeAccessorAspect{

	@Around("get(* org.javacream.training.aop..*.id)")
	public Object idReadingAccess(ProceedingJoinPoint pjp) throws Throwable {

		FieldSignature fieldSignature = (FieldSignature) pjp.getSignature();
		String fieldName = fieldSignature.getName();
		System.err.println("ATTRIBUTE-ACCESS: before accessing " + fieldName);
		try {
			Object result = pjp.proceed();
			System.err.println("ATTRIBUTE-ACCESS: after accessing " + fieldName);
			return result;
		} catch (Throwable e) {
			System.err.println("ATTRIBUTE-ACCESS: throwing from " + fieldName);
			throw e;
		}
	}
	
}
