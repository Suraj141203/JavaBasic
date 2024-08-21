package in.co.rays.javabasic;
import java.util.Scanner;

public class NoteCount {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter The Amount");
		int rupees = scan.nextInt();
		
		int[] notes = {500 , 200 , 100 , 50 , 20 , 10 , 5 , 2 , 1};
		
		System.out.println("Total Notes =" + notes.length);
		
		int count = 0;
		
		for( int i = 0; i < notes.length; i++) {
			
			count = rupees / notes[i];
			if (count >0) {
				System.out.println(notes[i] + "  Notes = " + count);
				scan.close();
			}
			rupees = rupees % notes[i];
		}
		
	}

}
