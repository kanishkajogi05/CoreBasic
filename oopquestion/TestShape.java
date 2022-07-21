package com.rays.oopquestion;

public class TestShape {
public static void main(String []args) {
	
	Shape s[]= new Shape[3];
	
	s[0]= new Rectangle(20,10);
	s[1]= new Circle(12);
	s[2]= new Triangle(30,40);
	
	Rectangle r= (Rectangle) s[0];
	Circle c= (Circle) s[1];
	Triangle t= (Triangle)s[2];
	
	
	double totalArea=0;
	
	for (int i=0; i<s.length; i++) {
		totalArea+=s[i].area();
	}
	System.out.println("Area Rectangle----"+r.area());
	System.out.println("Area Circle-------"+c.area());
	System.out.println("Area Triangle-----"+t.area());
	System.out.println("-------------------------------------");
	System.out.println("Total Area--------"+ totalArea);
	
}

}
