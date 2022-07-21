package com.rays.oop;

public class TestGetSet {
public static void main(String[]args) {
	
	Shapes s[]= new Shapes[3];
	s[0]=new Rectangle();
	s[1]=new Circle();
	s[2]=new Triangle();
	
	Rectangle r=(Rectangle)s[0];
	Circle c=(Circle)s[1];
	Triangle t=(Triangle)s[2];
	r.setLength(12);
	r.setwidth(10);
	c.setRadius(13);
	t.setBase(10);
	t.setHeight(15);
	
	double totalArea=0;
	
	for(Shapes a : s) {
		totalArea+= a.area();
	}
	System.out.println(totalArea);
}
}
