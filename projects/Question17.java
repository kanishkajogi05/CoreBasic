package com.rays.projects;

public class Question17 {
public static void m1(int arr1[],int arr2[]) {

	int temp=0;
	int i,j=0;
	
	for(i=0; i<arr1.length; i++) {
		
		for(j=0; j<arr2.length; j++) {
			
			if (arr1[i]==arr2[j]) {
				
				temp=arr2[j];
				j=arr2.length;
			}
	}    if (arr1[i]!=temp) {
		System.out.println("element not found of "+"  "+arr1[i]);
	}
	    
	}
    }
    public static void main (String []args) {
    	
    	int a[] = {23,45,67,76,34};
    	int b[] = {45,67,23};
    	
    	m1(a,b);
    }

}


	

