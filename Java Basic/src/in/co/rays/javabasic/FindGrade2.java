package in.co.rays.javabasic;

import java.util.Scanner;

public class FindGrade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the score: ");
        int score = sc.nextInt();
        
        char grade;
        switch (score / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8: 
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
                break;
        }
        
        System.out.println("The grade is: " + grade);
        
        sc.close();
    }
}

