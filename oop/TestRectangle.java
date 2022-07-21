package com.rays.oop;

public class TestRectangle {
public static void main (String[]args) {
	
	Rectangle r = new Rectangle(20,10);
	
	r.setColor("white");
	System.out.println(r.getColor());
	
	r.setBorderWidth(1);
	System.out.println(r.getBorderWidth());
	
	r.setLength(20);
	System.out.println(r.getLength());
	
	r.setwidth(10);
	System.out.println(r.getWidth());
	
	System.out.println(r.area());
}

}
