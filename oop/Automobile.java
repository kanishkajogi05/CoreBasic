package com.rays.oop;

public class Automobile {

	private String color;
	private int speed ;
	private String make;
	public static final int NUM_OF_GEAR=4;
	
	public void setColour(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setMake(String make) {
		this.make = make ;
	}
	public String getmake() {
		return make;
	}
	public void setSpeed(int speed) {
		this.speed = speed ;
	}
	public int getSpeed() {
		return speed;
	}
	public void breakk(int breakk) {
		speed=speed-breakk;
		setSpeed(speed);
	}
	public void changeGear(int changeGear) {
		if(changeGear>2)
		{
			speed=speed+20;
			setSpeed(speed);
		}else
			speed=speed-20;
			setSpeed(speed);
		}
	public void accelerator(int acceleration) {
		speed= acceleration+speed;
	    setSpeed(speed);
	}
	
		}

