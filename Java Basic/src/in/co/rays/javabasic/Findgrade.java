package in.co.rays.javabasic;

import java.util.Scanner;

public class FindGrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the score: ");
        int score = scan.nextInt();
        
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 75) {
            grade = 'B';
        } else if (score >= 60) {
            grade = 'C';
        } else if (score >= 45) {
            grade = 'D';
        } else {
            grade = 'F';
        }
 
        System.out.println("The grade is: " + grade);
        scan.close();
    }
}

