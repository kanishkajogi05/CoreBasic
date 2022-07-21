package com.rays.oop;

public class TestAutomobile {
public static void main(String[]args) {
	
	Automobile a = new Automobile();
	
	a.setColour("Mate Grey");
	System.out.println("Vehicle colour------------"+a.getColor());
	
	a.setMake("Hero 2019");
	System.out.println("Vehicle Brand-------------"+a.getmake());
	
	a.setSpeed(120);
	System.out.println("Vehicle Speed-------------"+a.getSpeed());
	
	a.breakk(10);
	System.out.println("Vehicle break-------------"+a.getSpeed());
	
	a.changeGear(2);
	System.out.println("Vehicle Change_Gear-------"+a.getSpeed());
	
	a.accelerator(30);
	System.out.println("Vehicle Acceleration------"+a.getSpeed());
}
}
