package com.aop.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import com.aop.jdk.MyAspect;

public class CglibProxy implements MethodInterceptor{

	public Object createProxy(Object target){
		Enhancer enhancer =new Enhancer();
		enhancer.setSuperclass(target.getClass());
		enhancer.setCallback(this);
		return enhancer.create();
	}
	
	@Override
	public Object intercept(Object proxy, Method arg1, Object[] arg2, MethodProxy methodProxy) throws Throwable {
		// TODO 自动生成的方法存根
		MyAspect myAspect = new MyAspect();
		myAspect.check_Permissions();
		Object obj = methodProxy.invokeSuper(proxy, arg2); 
		//此处的methodProxy 方法是invokeSuper ，与aop.jdk的不同
		myAspect.log();
		return obj;
	}

	
	/*
	 * 
	 * JDK的动态代理有一个限制，就是使用动态代理的对象必须实现一个或多个接口。
	 *	如果想代理没有实现接口的类，就可以使用CGLIB实现。
    */
}
