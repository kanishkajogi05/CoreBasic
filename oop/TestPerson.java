package com.rays.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {
public static void main(String[] args) throws ParseException {

		Person p = new Person();

		p.setName("kanishka");
		System.out.println("Hello-----------" + p.getName());

		p.setAdress("53/B kamla nehru ");
		System.out.println("Your address----" + p.getAddress());

		String str = "13/06/2002";
		
	    SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy");
	    Date date =f1.parse(str);
	    
	     p.setDate(date);
	     //System.out.println(p.getDate());
	     
	    Date date1= (p.getDate());
	    
	     System.out.println("Your DOB--------"+f1.format(date1));
	     
	     
	}

}
