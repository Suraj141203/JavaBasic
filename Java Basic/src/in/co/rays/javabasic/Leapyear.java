package in.co.rays.javabasic;

/*public class Leapyear {
	public static void main(String[] args) {
		int a= 2024;
		if(a%4 == 0) {
			System.out.println("This is Leap Year");
			}else {
				System.out.print("This is Not Year");
		}
	}
}*/
import java.util.Scanner;
public class Leapyear{
	public static void main(String[] args) {
		System.out.println("Enter Year");
		Scanner var = new Scanner(System.in);
		int year = var.nextInt();
		if(year%4 == 0) {
			System.out.println("This is Leap Year");
			}else {
				System.out.print("This is Not Leap Year");
		}
		var.close();
	}
}