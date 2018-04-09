package com.aop.ProxyFactoryBean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation m1) throws Throwable {
		// TODO �Զ����ɵķ������
		check_Permissions();
		Object obj = m1.proceed();
		log();
		return obj;
	}
	public void check_Permissions(){
		System.out.println("ģ����Ȩ��... FactoryBean");
	}
	public void log(){
		System.out.println("ģ���¼��־... FactoryBean");
	}
}
