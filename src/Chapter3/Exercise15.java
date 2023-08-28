package Chapter3;

import java.util.Scanner;

public class Exercise15 {
 
    public static void main(String[] strings) {
        // Chapter 3 Exercise 15
        // We will be making a lottery game that lets you pick 3 random numbers 
        // and the program will pick random numbers and see if they match.
        int lottery = (int) (Math.random() * 1000);
        
        // Prompting user to input three numbers for lotto
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery numbers/picks (three digits): ");
        int guess = input.nextInt();
        
        // Receiving the digits
        int lotteryDigit1 = lottery / 100;
        int lotteryDigit2 = lottery % 100 / 10;
        int lotteryDigit3 = lottery % 10;
        
        // Receiving the guessed digits
        int guessDigit1 = lottery / 100;
        int guessDigit2 = lottery % 100 / 10;
        int guessDigit3 = lottery % 10;
        
        // Results
        System.out.println("The lottery numbers are " + lottery);
        
        // Checking if the guess is similar to the input
        if (guess == lottery) {
            System.out.println("Exact match!: you win our cash prize of $10,000!");
        } else if (((guessDigit2 == lotteryDigit1) && (guessDigit1 == lotteryDigit2) && (guessDigit3 == lotteryDigit3)) ||
                ((guessDigit1 == lotteryDigit1) && (guessDigit3 == lotteryDigit2) && (guessDigit2 == lotteryDigit3)) ||
                ((guessDigit3 == lotteryDigit1) && (guessDigit1 == lotteryDigit2) && (guessDigit2 == lotteryDigit3)) ||
                ((guessDigit2 == lotteryDigit1) && (guessDigit3 == lotteryDigit2) && (guessDigit1 == lotteryDigit3)) ||
                ((guessDigit3 == lotteryDigit1) && (guessDigit2 == lotteryDigit2) && (guessDigit1 == lotteryDigit3))) {
            System.out.println("Matched all digits: you win our cash prize of $3,000!");
        } else if ((guessDigit1 == lotteryDigit1) || (guessDigit1 == lotteryDigit2) || (guessDigit1 == lotteryDigit3) ||
                (guessDigit2 == lotteryDigit1) || (guessDigit2 == lotteryDigit2) || (guessDigit2 == lotteryDigit3) ||
                (guessDigit3 == lotteryDigit1) || (guessDigit3 == lotteryDigit2) || (guessDigit3 == lotteryDigit3)) {
            System.out.println("Matched one digit: you win our cash prize of $1,000!");
        } else {
            System.out.println("Sorry, no matches, better luck next time!");
        }
    }
    
}
