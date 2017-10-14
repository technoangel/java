package org.technoangel.interview;

public class SpyClass extends SpyDecorator {

	private int calls;
	
	public SpyClass(IClass myClass) {
		super(myClass);
		calls = 0;
	}
	
	public void callableMethod() {
		calls++;
		super.callableMethod();
	}
	
	public int numberOfCalls() {
		return calls;
	}
}
