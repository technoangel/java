package org.technoangel.interview;

/**
 * A class that is proxied.
 */
class SomeClassImpl implements SomeClass {
  /** Holds the user name. */
  private String userName;

  /**
   * Creates a new SomeClass object.
   * 
   * @param userName
   *          The user name to use.
   */
  public SomeClassImpl(final String userName) {
    this.userName = userName;
  }

  /**
   * @see oreilly.hcj.proxies.SomeClass#someOtherMethod(java.lang.String)
   */
  public void someMethod() {
    System.out.println(this.userName);
  }

  /**
   * @see oreilly.hcj.proxies.SomeClass#someOtherMethod(java.lang.String)
   */
  public void someOtherMethod(final String text) {
    System.out.println(text);
  }
}