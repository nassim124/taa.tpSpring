package istic.taa.tpSpring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Before("execution(* istic..*(..))")
	public void logBefore(JoinPoint joinPoint) {

		System.err.println("logBefore() is running!");
		System.err.println("hijacked : " + joinPoint.getSignature().getName());
		System.err.println("******");
	}

}