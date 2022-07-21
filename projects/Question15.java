package com.rays.projects;

public class Question15 {
public static void main(String []args) {
	
	int[] arr= {20,34,45,56};
	
	m1( arr);
}	

public static void m1(int []a) {
	int x=0;
	int y=a[0];
	for (int i=0;i<a.length;i++) {
		
		if (y<x) {
			y=x;		
		}
		else {
			if(y>x&&y<a[i]) {
				x=y;
				y=a[i];
			}
		}
	}
	System.out.println(y);
}

 

}	
	



