package org.technoangel.interview;

/**
 * A simple proxy to SomeClass.
 */
class SomeClassCountingProxy implements SomeClass {
  /** The implementation object for this proxy. */
  private final SomeClassImpl impl;

  /** Holds the invocation count. */
  private int invocationCount = 0;

  /**
   * Creates a new SomeClassProxy object.
   * 
   * @param impl
   *          The implementation object for this proxy.
   */
  public SomeClassCountingProxy(final SomeClassImpl impl) {
    this.impl = impl;
  }

  /**
   * Gets the value of the property invocationCount.
   * 
   * @return The current value of invocationCount
   */
  public int getInvocationCount() {
    return invocationCount;
  }

  /**
   * @see oreilly.hcj.proxies.SomeClass#someMethod()
   */
  public void someMethod() {
    this.invocationCount++;
    this.impl.someMethod();
  }

  /**
   * @see oreilly.hcj.proxies.SomeClass#someOtherMethod(java.lang.String)
   */
  public void someOtherMethod(String text) {
    this.invocationCount++;
    this.impl.someOtherMethod(text);
  }
}