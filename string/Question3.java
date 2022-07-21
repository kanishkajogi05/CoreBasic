package com.rays.string;

public class Question3 {
public static void main (String[]main) {
		
		String str ="Vijay Dinanath Chauhan";
		
		char c = 'a';
		int count = 0;
		
		for ( int i=0; i<str.length(); i++) {
			if (str.charAt(i)==c) {
				count++;
			}
		}
		System.out.println("count ="+ count);
	}

	}


