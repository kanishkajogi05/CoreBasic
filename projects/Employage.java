package com.rays.projects;

import java.util.Calendar;
import java.util.Date;

public class Employage {
public static void main (String [] args ) {
	
	Date today = new Date ();
	
	Calendar cal= Calendar.getInstance();
	cal.setTime(today);
	
	System.out.println(today);
	
	int dayofyear =cal.get(Calendar.DAY_OF_YEAR);
	 System.out.println(dayofyear);
	 
	 
}

}
