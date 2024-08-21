package com.rays.exception;

public class TesAccount {
	
	public static void main(String[] args) throws InsufficientFundTransfer {
		
		Account a = new Account();
		
		a.withdraw(100.0);
		
	}
	

}
