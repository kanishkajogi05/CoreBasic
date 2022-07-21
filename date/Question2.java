package com.rays.date;

import java.util.Calendar;
import java.util.Date;

public class Question2 {
	public static void main (String []args ) {
		
		Date today = new Date ();
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(today);
	     
	     System.out.println("Date of Installation"+" "+today);
	    // cal.add(Calendar.DATE, 30);
		
		for (int i= 0; i<=12; i++) {
		    cal.add(Calendar.DATE, 30);	
		
		  
		   System.out.println("Date of Maintence"+" "+cal.getTime());
		
	}
	}
	}

