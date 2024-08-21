package com.rays.exception;

public class TestException {

	public static void main(String[] args) {

		// Example of ArithmeticException..
		int a = 5;

		
			System.out.println(a / 0);
		

		System.out.println("++++++++++++++");

		// Examole of NullPointerException..

		String str = null;

		try {

			System.out.println(str.length());

		} catch (NullPointerException e) {

			System.out.println(e.getMessage() + " NullPointerException");

		}

		System.out.println("++++++++++++++");

		// Examole of indexOutOfBond..
		String[] str1 = { "a", "b", "c" };

		try {

			System.out.println(str1[3]);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
