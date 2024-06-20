package com.rays.oops;

public class Student extends RichMan {
	
	int amount = 10000;

	@Override
	public void donation(int donateAmount) {
		
		System.out.println("Total Amount of Student = " + amount);

		amount = amount - donateAmount;
		
		System.out.println("Total Amount Student after donation = " + amount);
		
	}

}
