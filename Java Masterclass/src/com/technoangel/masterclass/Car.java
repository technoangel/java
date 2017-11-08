package com.technoangel.masterclass;

public class Car extends Vehicle {
	
	Integer gear;
	String type;
	
	public Car() {
		gear = 1;
		type = "Generic Car";
	}
	
	public String getCarType() {
		return type;
	}
	
	private void shift(Integer newGear) {
		this.gear = newGear;
	}
	
	public void upShift() {
		shift(2);
	}
	
	public void downShift() {
		shift(1);
	}
	
	public Integer getGear() {
		return(gear);
	}
}
