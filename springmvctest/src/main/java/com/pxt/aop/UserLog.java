package com.pxt.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserLog {
	
	@Before("execution(public * save(..))")
	public void before() {
		System.out.println("---------start----------");
	}
	
	@Around("execution(public * save(..))")
	public void around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("---------around start----------");
		pjp.proceed();
		System.out.println("---------around end----------");
	}
}
