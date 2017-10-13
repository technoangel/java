package org.technoangel.interview;

public class SportsCar extends CarDecorator {
	
	public SportsCar(ICar c) {
		super(c);
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding features of Sports Car");
	}
}
