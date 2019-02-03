package com.example.aop.aopproject.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BusinesAspects {

	// "copy Qualified Name option" is available to copy the method signature
	@Around("com.example.aop.aopproject.aspect.CommonPointCutConfig.businessLayerPointCut()")
	public void aroundAspect(ProceedingJoinPoint point) throws Throwable {
		System.out.println("--Before Method Execution----");
		long startTime = System.currentTimeMillis();

		Object proceed = point.proceed();// Proceeds with method execution

		long endTime = System.currentTimeMillis();
		System.out.println("--After Method Execution----" + proceed);

		System.out.println("Time Taken to execute(in ms): " + (endTime - startTime));
	}

//	@After(value = "execution (* com.example.aop.aopproject.business.*.*(..))")
//	public void afterAspect(JoinPoint point) {
//		System.out.println("After Call--  Calls Intercepted:" + point);
//	}
//
//	@AfterThrowing(value = "execution (* com.example.aop.aopproject.business.*.*(..))", throwing = "exception")
//	public void afterThrowingAspect(JoinPoint point, Object exception) {
//		System.out.println("After Returning  Calls Intercepted:" + point);
//		System.out.println("Eception Value: " + exception);
//	}
//
//	@AfterReturning(value = "execution (* com.example.aop.aopproject.business.*.*(..))", returning = "result")
//	public void afterAspect(JoinPoint point, Object result) {
//		System.out.println("After Returning  Calls Intercepted:" + point);
//		System.out.println("Returned Value: " + result);
//	}

	// Format (execution(* Package-Name.*.*(..))
	// This will intercept for all classes and
	// methods in the package(com.example.aop.aopproject.business).
	// (..) represents methods with any number of arguments.
//	@Before("execution (* com.example.aop.aopproject.business.*.*(..))")
//	public void beforeAspect(JoinPoint point) {
//		System.out.println("Before -- Calls Intercepted:" + point);
//		System.out.println("Checking User Access...");
//		System.out.println("User Access allowed...");
//	}
}
