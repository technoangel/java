package test.org.technoangel.interview;

import org.technoangel.interview.*;

public class CarTest {

	public static void main(String[] args) {
		ICar sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		System.out.println("\n*****");
		
		ICar sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.assemble();
	}

}