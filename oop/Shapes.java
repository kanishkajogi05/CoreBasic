package com.rays.oop;

public class Shapes {

	private String color = null;
	private int borderWidth= 0;
	
	public Shapes() {
		
	}
	
	public Shapes(String c, int bw) {
         color=c;
		 borderWidth= bw;
		 }
	
	public String getColor() {
	    return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public int getBorderWidth() {
		return borderWidth ;
	}
	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	public double area() {
		return 0;
	}
    }
	
	     
	     
