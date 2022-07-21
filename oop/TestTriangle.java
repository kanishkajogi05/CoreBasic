package com.rays.oop;

public class TestTriangle {
public static void main (String[]args) {
	
	Triangle t = new Triangle(20,10);
	
	t.setColor("Blue");
	System.out.println(t.getColor());
	
	t.setBorderWidth(2);
	System.out.println(t.getBorderWidth());
	
	t.setBase(20);
	System.out.println(t.getBase());
	
	t.setHeight(10);
	System.out.println(t.getHeight());
	
	System.out.println(t.area());
}
}
