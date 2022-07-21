package com.rays.oop;

import java.util.Date;

public class People {
	
	private String name = null;
	private String address = null;
	private Date dateOfBirth = null;
	
	public People() {
		System.out.println("i am default people");
	}
	
	public People (String name , String address) {
		this.name = name;
		this.address = address;
		System.out.println("i am two parameter people ");
		
	}
	
	public People (String name , String address, Date d) {
		this.name = name ;
		this.address = address;
		this.dateOfBirth = d;
		System.out.println("i am three parameter people");
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
}


