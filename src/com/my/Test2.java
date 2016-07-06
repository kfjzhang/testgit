package com.my;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Subject realSubject = new RealSubject();
		
		InvocationHandler handler = new DynamicProxy(realSubject);
		
		Subject sub=(Subject)Proxy.newProxyInstance(handler.getClass().getClassLoader(), realSubject.getClass().getInterfaces(), handler);
		
		sub.hello("admin");
		sub.rent();
	}

}
