package com.technoangel.masterclass;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.Matchers.*;

public class VehicleTest {

	@Test
	public void testLeft() {
		Car auto = new Ferrari();
		auto.turnLeft();
		assertThat(auto.getDirection(), equalTo("left"));
	}
	
	@Test
	public void testRight() {
		Car auto = new Ferrari();
		auto.turnRight();
		assertThat(auto.getDirection(), equalTo("right"));
	}
	
	@Test
	public void testUpshift() {
		Car auto = new Ferrari();
		auto.upShift();
		assertThat(auto.getGear(), equalTo(2));
	}
	
	@Test
	public void testDownshift() {
		Car auto = new Ferrari();
		auto.downShift();
		assertThat(auto.getGear(), equalTo(1));
	}
	
	@Test
	public void testAccelerate() {
		Car auto = new Ferrari();
		auto.accelerate();
		assertThat(auto.getSpeed(), greaterThan(0));
	}
	
	@Test
	public void testDecelerateFromStop() {
		Car auto = new Ferrari();
		auto.decelerate();
		assertThat(auto.getSpeed(), equalTo(0));
	}
	
	@Test
	public void testDecelerate() {
		Car auto = new Ferrari();
		auto.speed = 4;
		auto.decelerate();
		assertThat(auto.getSpeed(), equalTo(3));
	}
	
	@Test
	public void testCarType() {
		Car auto = new Ferrari();
		assertThat(auto.getCarType(), equalTo("Ferrari"));
	}

}
