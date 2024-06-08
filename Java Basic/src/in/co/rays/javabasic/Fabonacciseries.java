package in.co.rays.javabasic;

import java.util.Scanner;

public class Fabonacciseries {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of the term of the Fabonnaci series");
		int n = scan.nextInt();
		
		int firstTerm = 0 , secondTerm = 1;
		
		System.out.println("Fabonacci Series till " + n +" terms :");
		
		for( int i = 1; i <=n; i++) {
			System.out.println( firstTerm + "");
			
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
		scan.close();
		}

}
