package com.rays.exception;

public class TryCatch {
public static void main(String[]args) {
	
	int a = 10;
	int b = 0;
	try {
		int c=a/b;
		System.err.println(c);
	} catch ( Exception e) {
		System.err.println("not divide by zero");
		System.err.println(e.getMessage());
		e.printStackTrace();
	}
}

}
