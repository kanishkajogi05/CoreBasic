package com.rays.projects;

public class Question18 {
public static int m1  (int num , int []a) {
	
	int count =0;
	
	for (int i=0; i<a.length; i++) {
		if (a[i]==num) {
			 count++;
			 System.out.println("num is found "+a [i]+" "+"index of num "+" "+i);
			 
		}
	}
	
	if ( count>0) {
		return 1;
		
	}
	else {
		return -1;
		
		
	}
	
}
 public static void main(String[]args) {
	 
	 int arr []= {25,24,23,20,19,10};
	 int i=m1(24,arr);
	 System.out.println(i);
 }

} 
