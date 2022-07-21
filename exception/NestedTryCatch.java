package com.rays.exception;

public class NestedTryCatch {
public static void main(String[] args) {
	
	int a=10;
	int b=0;
	String s="vijay";
	
	try {
		int c=a/b;
		
	} catch (ArithmeticException e) {
		System.out.println("");
	}
}

}
