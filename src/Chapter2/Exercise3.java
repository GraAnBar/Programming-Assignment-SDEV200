package Chapter2;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] Strings) {
        // Chapter 2 Exercise 2.3 
        // Will be creating a program that lets us input a value and converts it into feet.
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();
        double meters = feet * 0.305;
        System.out.println(feet + " feet is " + meters + " meters ");
    } 
}
