package com.technoangel.interview;

public class SingletonObject {

	static SingletonObject myObject;
	
	private SingletonObject() {}
	
	static {
		myObject = new SingletonObject();
	}
	
	public static SingletonObject getInstance() {
		return myObject;
	}
	
	public void testMe() {
		System.out.println("I'm here");
	}
	
	public static void main(String[] args) {
		SingletonObject oj = SingletonObject.getInstance();
		oj.testMe();
	}

}
