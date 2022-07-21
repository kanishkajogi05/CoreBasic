package com.rays.oop;

import java.util.Date;

public class Person {
	
	private String name = null;
	private Date dateOfBirth;
	private String address=null;
	
	public void setName(String name) {
		this.name =name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setDate(Date d) {
		this. dateOfBirth =d ;
	}
	
	public Date getDate() {
		return dateOfBirth ;
	}
	
    public void setAdress(String address) {
    	this.address =address;
    }
    
    public String getAddress() {
    	return address;
    }
}
