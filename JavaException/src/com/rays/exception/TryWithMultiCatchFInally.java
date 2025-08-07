package com.rays.exception;

public class TryWithMultiCatchFInally {
	public static void main(String[] args) {
		String s = null;
//		int a = 10 / 0;
		try {

			System.out.println(s.length());
			System.out.println(s.charAt(5));

		} catch (ArithmeticException e) {
			System.out.println(e);
//			System.exit(0);

		} catch (NullPointerException e) {
			System.out.println(e);
//			System.exit(0);

		} finally {
			System.out.println("Finally block");
		}
	}
}