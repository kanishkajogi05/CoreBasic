package com.rays.oop;

public class Triangle extends Shapes {

	private int base;
	private int height;
	private double area;
	
	public Triangle() {
		
	}
	
	public Triangle(int base ,int height) {
		this.base = base;
		this.height = height;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getBase() {
		return base;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public double area() {
		return area = (base * height)/2;

	}

}
