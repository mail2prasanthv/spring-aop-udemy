package com.example.aop.aopproject.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointCutConfig {

	@Pointcut("@annotation(com.example.aop.aopproject.business.TrackTime)")
	public void annotationBasedPointCut() {
	}

	@Pointcut("execution (* com.example.aop.aopproject.business.*.*(..))")
	public void businessLayerPointCut() {
	}

	@Pointcut("execution (* com.example.aop.aopproject.dao.*.*(..))")
	public void dataLayerPointCut() {
	}

	@Pointcut("com.example.aop.aopproject.aspect.CommonPointCutConfig.dataLayerPointCut()"
			+ "&&com.example.aop.aopproject.aspect.CommonPointCutConfig.businessLayerPointCut()")
	public void combinedPointCut() {
	}

	@Pointcut("bean(*dao*")
	public void beanStartingWithDAO() {
	}
}
