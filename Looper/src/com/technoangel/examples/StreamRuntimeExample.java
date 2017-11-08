package com.technoangel.examples;

import java.util.stream.Stream;

public class StreamRuntimeExample {
	// This compiles because there are operations on the stream.
	// However, they are not strung together, so after filtering, the stream is closed.
	// You need to remove the semicolon and call the forEach on the filter directly afterward
	public static void main(String[] args) {
		Stream<Integer> nums = Stream.of(1, 2, 3, 4, 5);
		nums.filter(n -> n % 2 == 1);
		nums.forEach(p -> System.out.print(p));
	}
}
