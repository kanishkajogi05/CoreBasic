package com.rays.oop;

public class TestAccount {
public static void main(String []args) {
	
	Account a = new Account();
	
	a.setNumber("NT987654321");
	System.out.println("Acc no.-------------------------"+a.getNumber());
	
	a.setAccountType("Saving Acc");
	System.out.println("Acc Type------------------------"+a.getAccountType());
	
	a.setBalance(5000);
	System.out.println("Acc Balance---------------------"+a.getBalance());
	
	a.deposite(2000);
	System.out.println("Acc Balance after Deposite------"+a.getBalance());
	
	a.withdrawal(1000);
	System.out.println("Acc Balance after Withdrawal----"+a.getBalance());
}

}
