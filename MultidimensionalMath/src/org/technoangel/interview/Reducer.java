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
	
	public void reduceArrays(double[][] array, BinaryOperator<Double> operation) {
		Reducer.displayArray(array);
		
		DoubleStream stream = Arrays.stream(array)
				.flatMapToDouble(x -> Arrays.stream(x));
		System.out.println(stream.reduce(0, (double x, double y) -> operation.apply(x, y)));
	}
}
