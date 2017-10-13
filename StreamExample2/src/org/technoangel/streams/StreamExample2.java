package org.technoangel.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamExample2 {
	static List<Employee> employeeList = Arrays.asList(	
		new Employee("Tom Jones", 45, 7000.00),
		new Employee("Harry Major", 25, 10000.00),
		new Employee("Ethan Hardy", 65, 8000.00),
		new Employee("Nancy Smith", 22, 12000.00),
		new Employee("Deborah Sprightly", 29, 9000.00)
	);
	 
	public static void main(String[] args) {
		Optional<Employee> topEarner = employeeList.stream()
				.reduce((Employee a, Employee b) -> a.getSalary() > b.getSalary() ? a:b);
		if (topEarner.isPresent()) {
			System.out.println("Total salary expense: " + topEarner.get().getSalary());
		} else {
			System.out.println("No top earner.");
		}
	}
}
