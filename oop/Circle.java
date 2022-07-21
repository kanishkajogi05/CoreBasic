package com.rays.oop;

public class Circle extends Shapes{
	
	private int radius;
	private double area;
	public static final double PI=3.14;
	
	public Circle() {
		
	}
	
	public Circle(int radius) {
		this.radius=radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	public double area() {
	return area=PI*radius*radius;
	}
	
	}


