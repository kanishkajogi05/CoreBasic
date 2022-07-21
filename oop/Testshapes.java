package com.rays.oop;

public class Testshapes {
	public static void main(String[] args) {

		Shapes s[] = new Shapes[3];
		s[0] = new Rectangle(20, 10);
		s[1] = new Circle(5);
		s[2] = new Triangle(30, 20);

		Rectangle r = (Rectangle) s[0];
		Circle c = (Circle) s[1];
		Triangle t = (Triangle) s[2];

		System.out.println("Rectangle:" + r.area() + "  " + "Circle:" + c.area() + "  " + "Triangle:" + t.area());

		double totalArea = 0;
		for (Shapes a : s) {

			totalArea += a.area();
			// for(int i =0;i<s.length;i++) {
			// totalArea += s[i].area();

		}
		System.out.println(totalArea);
	}

}
