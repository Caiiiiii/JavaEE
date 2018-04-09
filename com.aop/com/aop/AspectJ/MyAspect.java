package com.aop.AspectJ;



import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
	public void myBefore(JoinPoint joinPoint){
		System.out.print("ǰ��֪ͨ��ģ��ִ��Ȩ�޼��...");
		System.out.print("Ŀ�����ǣ�"+joinPoint.getTarget());
		System.out.print(",��ֲ����ǿ�����Ŀ�귽��Ϊ��"+joinPoint.getSignature().getName());
	}
	
	public void myAfterReturning(JoinPoint joinPoint){
		System.out.print("����֪ͨ��ģ���¼��־...");
		System.out.print(",��ֲ����ǿ�����Ŀ�귽��Ϊ��"+joinPoint.getSignature().getName());
	}
	
	public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		System.out.println("���ƿ�ʼ��ִ��Ŀ�귽��֮ǰ��ģ�⿪������...");
		Object obj = proceedingJoinPoint.proceed();
		System.out.println("���ƽ�����ִ��Ŀ�귽��֮��ģ��ر�����...");
		return obj;
	}
	
	public void myAfterThrowing(JoinPoint joinPoint,Throwable e){
		System.out.println("�쳣֪ͨ��������"+e.getMessage());
	}
	
	public void myAfter(){
		System.out.println("����֪ͨ��ģ�ⷽ����������ͷ���Դ...");
	}
}
