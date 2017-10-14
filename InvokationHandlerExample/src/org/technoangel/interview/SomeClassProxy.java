package org.technoangel.interview;

/**
 * A simple proxy to SomeClass.
 */
class SomeClassProxy implements SomeClass {
  /** The impl object for this proxy. */
  private final SomeClassImpl impl;

  /**
   * Creates a new SomeClassProxy object.
   * 
   * @param impl
   *          The implementation object for this proxy.
   */
  public SomeClassProxy(final SomeClassImpl impl) {
    this.impl = impl;
  }

  /**
   * @see oreilly.hcj.proxies.SomeClass#someMethod()
   */
  public void someMethod() {
    this.impl.someMethod();
  }

  /**
   * @see oreilly.hcj.proxies.SomeClass#someOtherMethod(java.lang.String)
   */
  public void someOtherMethod(String text) {
    this.impl.someOtherMethod(text);
  }
}
