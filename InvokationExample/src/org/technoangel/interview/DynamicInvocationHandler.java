package org.technoangel.interview;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;

public class DynamicInvocationHandler {
 
	public void main(String[] args) {
		Map proxyInstance = (Map) Proxy.newProxyInstance(
				  Map.class.getClassLoader(), 
				  new Class[] { Map.class }, 
				  (proxy, method, methodArgs) -> {
				    if (method.getName().equals("get")) {
				        return 42;
				    } else {
				        throw new UnsupportedOperationException(
				          "Unsupported method: " + method.getName());
				    }
				});
	}
    
}