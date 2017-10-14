package org.technoangel.interview;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Runner {
	public static final void main(final String[] args) {
		SomeClass proxy = SomeClassFactory.getDynamicSomeClassProxy();
		proxy.someMethod();
		proxy.someOtherMethod("Our Proxy works!");
		proxy.someMethod();
		proxy.someOtherMethod("Our Proxy works!");
		proxy.someMethod();
		proxy.someOtherMethod("Our Proxy works!");

		InvocationHandler handler = Proxy.getInvocationHandler(proxy);
		if (handler instanceof MethodCountingHandler) {
			System.out.println(((MethodCountingHandler)handler).getInvocationCount());
		}
	}
}
