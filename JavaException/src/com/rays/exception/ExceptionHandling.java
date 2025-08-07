package com.rays.exception;

public class ExceptionHandling {
	public static void main(String[] args) {
		
		try {
			int[] array = { 1, 2, 3 };
			System.out.println(array[5]); 
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
		}

		try {
			int result = 10 / 0; 
		} catch (ArithmeticException e) {
			System.out.println("Caught ArithmeticException: " + e.getMessage());
		}

		try {
			String str = null;
			System.out.println(str.length());
		} catch (NullPointerException e) {
			System.out.println("Caught NullPointerException: " + e.getMessage());
		}

		try {
			String invalidNumber = "abc";
			int number = Integer.parseInt(invalidNumber);
		} catch (NumberFormatException e) {
			System.out.println("Caught NumberFormatException: " + e.getMessage());
		}

		try {
			Object x = null;
			System.out.println(x.toString());
		} catch (Exception e) {
			System.out.println("Caught a general Exception: " + e.getClass().getName() + " - " + e.getMessage());
		}

		System.out.println("Program execution continues...");
	}
}
