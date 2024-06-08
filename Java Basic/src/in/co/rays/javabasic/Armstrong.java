package in.co.rays.javabasic;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Value");
		int n = sc.nextInt();
		
		int sum=0 , temp=n;
		int r;
		
		while(temp>0) {
			r = temp%10;
			sum+= r*r*r;
			temp = temp/10;
		}
		
		if(sum==n) {
			System.out.println("Number is an Armstrong number.");
		} else {
			System.out.println("Number is not an Armstrong number");
			
		}
		sc.close();
		

			
		}
	}
