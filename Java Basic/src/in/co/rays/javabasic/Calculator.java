package in.co.rays.javabasic;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Calculater");
		
		System.out.println("Enter First Number");
		double num1 = scan.nextDouble();
		
		System.out.println("Choose an operation: +,-,*,/");
		char operator = scan.next().charAt(0);
		
		System.out.println("Enter second number: ");
		double num2 = scan.nextDouble();
		
		double result;
		
		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
			
		case '-':
			result = num1 - num2;
			break;
			
		case '*':
			result = num1 * num2;
			break;
			
		case '/':
			if (num2 != 0) {
				result = num1 / num2;
			}else {
				System.out.println("Error! Invalid Operator");
				return;
			}
			break;
			default:
			System.out.println("Error! Invalid Operator.");
			return;
		}
		System.out.println("The result is: " + result);
		
	} 
	
}
