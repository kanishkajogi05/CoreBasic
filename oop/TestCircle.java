package com.rays.oop;

public class TestCircle {
public static void main (String [] args) {
	
	Circle c = new Circle(5);
	
	c.setColor("black");
	System.out.println("Circle Color------------"+c.getColor());
	
	c.setBorderWidth(10);
	System.out.println("Circle BorderWidth------"+c.getBorderWidth());
	
	c.setRadius(5);
	System.out.println("Circle Radius ----------"+c.getRadius());
	
	System.out.println("Circle Area-------------"+c.area());
}

}
