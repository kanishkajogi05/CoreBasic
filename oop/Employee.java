package com.rays.oop;

public class Employee extends People {
	
	private float salary = 0;
	
	public Employee() {
		
	}
	public Employee(String name , String add, float sal) {
		super( name ,add);
		this.salary = sal;
		
	}
	public float getSalary() {
		return salary;
	}
}
