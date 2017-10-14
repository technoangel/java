package org.technoangel.interview;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * A demonstration of a proxy factory.
 */
class SomeClassFactory {
  /** Holds the logging object. */

  /**
   * Gets a counting proxy to an object that is constructed with the user name.
   * 
   * @return The proxy to the implementation.
   */
  public static final SomeClassCountingProxy getCountingProxy() {
    SomeClassImpl impl = new SomeClassImpl(System.getProperty("user.name"));
    return new SomeClassCountingProxy(impl);
  }

  /**
   * Gets proxy to depending upon debug status in Log4J.
   * 
   * @return The proxy to the implementation.
   */
  public static final SomeClass getDynamicSomeClassProxy() {
    SomeClassImpl impl = new SomeClassImpl("ERIC!");
    InvocationHandler handler = new MethodCountingHandler(impl);
    Class[] interfaces = new Class[] { SomeClass.class };
    ClassLoader loader = SomeClassFactory.class.getClassLoader();
    SomeClass proxy = (SomeClass) Proxy.newProxyInstance(loader, interfaces, handler);
    return proxy;
  }

  /**
   * Gets a proxy to an object that is constructed with the user name.
   * 
   * @return The proxy to the implementation.
   */
  public static final SomeClassProxy getProxy() {
    SomeClassImpl impl = new SomeClassImpl(System.getProperty("user.name"));
    return new SomeClassProxy(impl);
  }

  /**
   * Gets proxy to depending upon debug status in Log4J.
   * 
   * @return The proxy to the implementation.
   */
  public static final SomeClass getSomeClassProxy() {
    SomeClassImpl impl = new SomeClassImpl(System.getProperty("user.name"));
    if (true) {
      return new SomeClassCountingProxy(impl);
    } else {
      return new SomeClassProxy(impl);
    }
  }
}