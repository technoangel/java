package org.technoangel.streams;

import java.util.Arrays;
import java.util.List;

public class StreamExample1 {
	static List<Employee> employeeList = Arrays.asList(	
		new Employee("Tom Jones", 45, 7000.00),
		new Employee("Harry Major", 25, 10000.00),
		new Employee("Ethan Hardy", 65, 8000.00),
		new Employee("Nancy Smith", 22, 12000.00),
		new Employee("Deborah Sprightly", 29, 9000.00)
	);
	 
	public static void main(String[] args) {
		Double totalSalaryExpense = employeeList.stream()
				.map(emp -> emp.getSalary())
				.reduce(0.00, (a,b) -> a+b);
		System.out.println("Total salary expense: "+totalSalaryExpense);
	}
}
