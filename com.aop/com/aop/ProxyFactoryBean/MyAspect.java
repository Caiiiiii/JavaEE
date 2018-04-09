package com.aop.ProxyFactoryBean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation m1) throws Throwable {
		// TODO 自动生成的方法存根
		check_Permissions();
		Object obj = m1.proceed();
		log();
		return obj;
	}
	public void check_Permissions(){
		System.out.println("模拟检查权限... FactoryBean");
	}
	public void log(){
		System.out.println("模拟记录日志... FactoryBean");
	}
}
