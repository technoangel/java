package org.technoangel.interview;

public class GrocerySelector {

	public static final String FRUIT1 = "Apple";
	public static final String FRUIT2 = "Banana";
	public static final String FRUIT3 = "Cherry";
	public static final String FRUIT4 = "Peach";
	public static final String FRUIT5 = "Strawberry";
	
	public GrocerySelector() {
	}
	
	public static void main(String[] args) {
		String setOfObjects[] = {FRUIT1, FRUIT2, FRUIT3, FRUIT4, FRUIT5};
		
		int howManyToChoose = 3;
		
		Permutation p = new Permutation();
		p.printCombinations(setOfObjects, howManyToChoose);
	}
}
