package org.technoangel.interview;

import java.util.function.BinaryOperator;

public class MultiMath {
	
	public static void main(String[] args) {
		double[][] array = {{2, 4}, {1, 2}};
		
		BinaryOperator<Double> operation = (n1, n2) -> n1 + n2;
		System.out.println(operation.apply(3d, 4d));
		
		Reducer.displayArray(array);
		
		Reducer reducer = new Reducer();
		reducer.reduceArrays(array, operation);
	}

}
