package com.rays.exception;

public class Pizza {
public static void main(String[] args) {
	int price= 200;
	
	if (price>100) {
		try {
			throw new PriceFilter();
			
		} catch(PriceFilter  e) {
			System.err.println("i can't buy this pizaa");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}else {
	 System.out.println("I Love Pizza");
	}
}

}
