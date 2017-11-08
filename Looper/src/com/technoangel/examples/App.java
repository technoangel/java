package com.technoangel.examples;

public class App {
	void calcBill() {
		// public class Invoice isn't effective because a non-final, 
		// non-abstract access modifier isn't permitted
		class Invoice {
			void print() {
				System.out.println("Invoice Printed");
			}
		}
		new Invoice().print();
	}
}
