package org.technoangel.interview;

import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class MultiMath {
	
	public static void main(String[] args) {
		
		// One: Build the array
		double[][] array = {{2, 4}, {1, 2}};
		
		// Two: Build the BinaryOperator - Double is the elements in and out
		BinaryOperator<Double> operation = (n1, n2) -> n1 + n2;
		
		// Three: Show the contents
		Reducer.displayArray(array);
		
		// Four: Build a new Reducer object
		Reducer reducer = new Reducer();
		
		// Five: Tell the Reducer to process the array with the operation
		Double answer = reducer.reduceArrays(array, operation);
		System.out.println(answer);
		
		// Alternate example for my practice
		String[] stringArray = {"Apple", "Cherry"};
		Stream<String> stringStream = Arrays.stream(stringArray)
				.map((String x) -> x.toUpperCase());
		stringStream.forEach(element -> System.out.println(element));
	}
}
