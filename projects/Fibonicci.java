package com.rays.projects;

public class Fibonicci {
public static void main (String []args ) {
	
	int number=5 ;
	int first =0;
	int second =1;
	 
		for( int i=0;i<=number;i++) {
			
			System.out.println(first);
			
		int third =first+second ;
			
	         first= second ;
	         
			 second =third ;
			}


}
}