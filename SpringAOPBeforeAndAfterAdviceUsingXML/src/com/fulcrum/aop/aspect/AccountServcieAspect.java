package com.fulcrum.aop.aspect;

import org.aspectj.lang.JoinPoint;

public class AccountServcieAspect {
	
	public void beforeAdvice(JoinPoint joinPoint) {
		System.out.println("Before Method : "+joinPoint.getSignature().getName() + "  Class Name :" + joinPoint.getTarget().getClass().getSimpleName());
	}
	
	public void afterAdvice(JoinPoint joinPoint) {
		System.out.println("After Method : "+joinPoint.getSignature().getName() + "  Class Name :" + joinPoint.getTarget().getClass().getSimpleName());
	}
}
