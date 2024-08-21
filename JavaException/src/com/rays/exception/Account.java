package com.rays.exception;

public class Account {

	private double balance = 2000;

	public double deposite(double damount) {

		balance = balance + damount;

		return balance;

	}

	public double withdraw(double wamount) throws InsufficientFundTransfer {

		if (wamount > balance) {

			throw new InsufficientFundTransfer("Insufficient Fund in you account");

		} else {

			balance = balance - wamount;
			
			System.out.println(balance);

			return balance;

		}

	}

}
