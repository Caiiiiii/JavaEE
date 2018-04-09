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
		// TODO �Զ����ɵķ������
		MyAspect myAspect = new MyAspect();
		myAspect.check_Permissions();
		Object obj = methodProxy.invokeSuper(proxy, arg2); 
		//�˴���methodProxy ������invokeSuper ����aop.jdk�Ĳ�ͬ
		myAspect.log();
		return obj;
	}

	
	/*
	 * 
	 * JDK�Ķ�̬������һ�����ƣ�����ʹ�ö�̬����Ķ������ʵ��һ�������ӿڡ�
	 *	��������û��ʵ�ֽӿڵ��࣬�Ϳ���ʹ��CGLIBʵ�֡�
    */
}
