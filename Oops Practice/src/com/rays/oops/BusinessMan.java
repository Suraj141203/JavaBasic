package com.rays.oops;

public class BusinessMan extends RichMan {
	
	public int amount = 200000;

	@Override
	public void donation(int donateAmount) {
		
		System.out.println("Total Amount of BusinessMan = " + amount);

		amount = amount - donateAmount;
		
		System.out.println("Total Amount after donation = " + amount);
	}

	

}
