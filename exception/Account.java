package com.rays.exception;

public class Account {
	
	private String number;
	private String type;
	private double balance;
	
	public Account(String num,String typ,double bal) {
		this.number=num;
		this.type=typ;
		this.balance=bal;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public String getNumber() {
		return number;
	}
	public String getType() {
		return type;
	}
	public double getBalance() {
		return balance;
	}
	public double deposite(double deposite) {
		return balance=getBalance()+deposite;
	}
	
	public void withdrwa(double withdrwa) {
		double current = getBalance()-withdrwa;
		if (current<2000) {
			
		
		try {
			
				throw new MinimumBalance();
			}
			/*else {
			setBalance(current);
			}*/
			 catch (Exception e) {
			 System.err.println("minimum balace should be 2000");
			 e.printStackTrace();
		  }}else {
				setBalance(current);
				}
		   
	}
}
