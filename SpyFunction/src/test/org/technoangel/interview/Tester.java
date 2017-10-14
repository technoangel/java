package test.org.technoangel.interview;

import org.technoangel.interview.*;

public class Tester {

	public static void main(String[] args) {
		IClass baseClass = new SpyClass(new BaseClass());
		
		for(int i = 0; i < 5; i++) {
			baseClass.callableMethod();
		}
	}
}
