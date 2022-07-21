package com.rays.oop;

public class Student extends Person {
	
	private String rollNo;
	private int marks;
	
	public void setRollNo(String rollNo ) {
		this.rollNo = rollNo;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setMark(int marks) {
		this.marks = marks;
	}
	public int setMark() {
		return marks;
	}

}