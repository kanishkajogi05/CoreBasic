package com.rays.exception;

public class TestAccount {
public static void main (String[]args) {

	Account a=new Account("987654321","current Acc",8000);
	
	a.getNumber();
	System.out.println(a.getNumber());
	a.getType();
    System.out.println(a.getType());
    a.getBalance();
    System.out.println(a.getBalance());
    a.deposite(2000);
    System.out.println(a.getBalance());
    a.withdrwa(9000);
    System.out.println(a.getBalance());
    
		
	}
    }

   


