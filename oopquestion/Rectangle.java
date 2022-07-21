package com.rays.oopquestion;

public class Rectangle extends Shape {
	
	private int length;
	private int width;
	private double area;
	
    public Rectangle() {
		
	}
	
	public Rectangle(int length,int width) {
		this.length=length;
		this.width=width;
		
	}
	
	public void setLength(int length) {
		this.length=length;
	}
	public int getLength() {
		return length;
	}
	public void setwidth(int width) {
		this.width=width;
	}
	public int getWidth() {
		return width;
	}
	public double area () {
		return area = length*width;
	}
	}

