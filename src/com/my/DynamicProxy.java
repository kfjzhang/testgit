package com.my;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {

	private Object subject;
	
	public DynamicProxy(Object subject)
    {
        this.subject = subject;
    }
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		System.out.println("��������ǰ��������");
		
		method.invoke(subject, args);
		
		System.out.println("�������ú�.............");
		
		
		return null;
	}

}
