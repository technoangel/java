package com.technoangel.masterclass;

public class Vehicle {
	String direction;
	Integer speed;

	public Vehicle() {
		this.direction = "straight";
		this.speed = 0;
	}
	
	public void accelerate() {
		this.speed++;
	}
	
	public void decelerate() {
		if (this.speed > 0) { this.speed--; }
	}
	
	public Integer getSpeed() {
		return this.speed;
	}
	
	private void turnDirection(String direction) {
		this.direction = direction;
	}
	
	public void turnLeft() {
		turnDirection("left");
	}
	
	public void turnRight() {
		turnDirection("right");
	}
	
	public String getDirection() {
		return(direction);
	}

}
