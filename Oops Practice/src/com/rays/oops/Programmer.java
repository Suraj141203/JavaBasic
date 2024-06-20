package com.rays.oops;

class Programmer extends Employee {
	float bonus = 10000;

	public static void main(String args[])

	{

		Programmer p = new Programmer();
		float total = p.salary + p.bonus;
		System.out.println("Programmer Salary is:" + p.salary);
		System.out.println("Bonus of Programmer is:" + p.bonus);
		System.out.println("Total Salary Of Programmer is: " + total);
	}
}
