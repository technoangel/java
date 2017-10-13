package org.technoangel.interview;

import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.stream.DoubleStream;

public class Reducer {
	
	public static void displayArray(double[][] array) {
		for (double[] seq : array) {
			for (double digit : seq) {
				System.out.print(digit + " ");
			}
			System.out.println("");
		}
		System.out.println("-------------------------");
	}
	
	public DoubleStream streamifyArray(double[][] array) {
		return Arrays.stream(array).flatMapToDouble(x -> Arrays.stream(x));
	}
	
	public Double reduceArrays(double[][] array, BinaryOperator<Double> operation) {
		
		// Arrays.stream x 2 converts a multidimensional array
		// flatMapToDouble converts the elements
		DoubleStream stream = streamifyArray(array);
		
		// answer reduces based on user function
		Double answer = stream.reduce(0, (double x, double y) -> operation.apply(x, y));
		return answer;
	}
}
