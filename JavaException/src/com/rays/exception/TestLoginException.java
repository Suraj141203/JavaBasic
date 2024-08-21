package com.rays.exception;

public class TestLoginException {

	public static void main(String[] args) throws LoginException {

		String login = "pass12@gmail.com";

		if (login == null || login != "pass123@gmail.com") {
			
			throw new LoginException("Invalid loginId");

		} else {
			System.out.println("login Successfully...");
		}

	}

}
