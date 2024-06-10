package in.co.rays.javabasic;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Int Value");
        
        int i = scan.nextInt();
        
        System.out.println("Enter Double Value");
        double d = scan.nextDouble();
        scan.nextLine();      
        
        System.out.println("Enter String");
        String s = scan.nextLine();
        scan.close(); 

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}