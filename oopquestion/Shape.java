package com.rays.oopquestion;

public abstract class Shape {

	private String color;
	private int borderWidth;
	
	public void setColour (String color) {
		this.color=color;
	}
	public String getColour() {
		return color;
	}
	public void setBorderWidth(int bw) {
		this.borderWidth= bw;
	}
	public int getBorderWidth() {
		return borderWidth;
	}
	public abstract double area() ;
		
	}
