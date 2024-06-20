package com.rays.oops;

public class TestRichMan {
	
	public static void main(String[] args) {
		
		RichMan[] r = new RichMan[2];
		
		r[0] = new BusinessMan();
		r[1] = new Student();
		
		r[0].donation(1000);
		r[1].donation(500);
		
		
	}

}
