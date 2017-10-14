package org.technoangel.interview;

public class SpyDecorator implements IClass {
	private IClass myClass;
	
	public SpyDecorator(IClass myClass) {
		this.myClass = myClass;
	}
	
	@Override
	public void callableMethod() {
		myClass.callableMethod();
	}

}
