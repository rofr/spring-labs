package aop;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logger {

	@Around("execution(* *.*(..))")
	public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
		
		String methodName = joinPoint.getSignature().getName();
		System.out.println("Intercepting call to " + methodName);

		long start = System.currentTimeMillis();

		Object result = joinPoint.proceed();
		
		long duration = System.currentTimeMillis() - start;
		System.out.println("Execution time ms: " + duration);
		
		return result;
	}
}
