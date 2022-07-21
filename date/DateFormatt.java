package com.rays.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatt {
	public static void main(String[]args) {
		
		Date today= new Date ();
		
		SimpleDateFormat f1= new SimpleDateFormat("dd/MM/yy");
		
		//Date pDate=F1.parse("13/06/2002");
		
		String strDate = f1.format(today);
		System.out.println("format#1:"+strDate);
		
		SimpleDateFormat f2 = new SimpleDateFormat("MMM dd,yyyy");
		String strDate1 = f2.format(today);
		System.out.println("Format#2:"+strDate1);
		
		SimpleDateFormat f3 = new SimpleDateFormat("dd.MM.yy");
		String strDate3 = f3.format(today);
		System.out.println("Format#3:"+strDate3);
		
		
	}

	}

