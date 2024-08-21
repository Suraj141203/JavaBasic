package in.co.rays.javabasic;
import java.util.Scanner;

public class ReverseNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int no = sc.nextInt();
		
		int temp = no;
		int r = 0;
		int sum = 0;
		
		while( temp > 0) {
			
			r = temp %10;
			sum = (sum*10)+r;
			temp = temp /10;
		}
		System.out.println("Reverse Number:  "+ sum);
		sc.close();
	}

}
