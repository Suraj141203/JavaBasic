package in.co.rays.javabasic;

import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        
        double harmonicSum = 0.0;
        for (int i = 1; i <= n; i++) {
            harmonicSum += 1.0 / i;
        }
        
        System.out.printf("The harmonic series sum up to %d terms is: %1f\n", n, harmonicSum);
        
        scanner.close();
    }
}

