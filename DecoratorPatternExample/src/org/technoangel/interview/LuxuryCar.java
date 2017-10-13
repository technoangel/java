package org.technoangel.interview;

public class LuxuryCar extends CarDecorator {
	
	public LuxuryCar(ICar c) {
		super(c);
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding features of Luxury Car");
	}
}