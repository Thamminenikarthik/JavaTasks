package TASKS;

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
//    1.Write a Java program that generates a random number between 1 and 10. The user gets 3 chances to guess the number.
//
//    If the user guesses correctly, display "You Won!" and stop the game.
//    If all 3 attempts are wrong, display "You Lost!" and show the random number.

    public static void main() {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        boolean guessed = false;

        Random Rnum = new Random();

        System.out.println("Welcome, Enter a range to Randomize");
        System.out.println("Enter any number which is greater than 3");
        input = sc.nextInt();

        int randomNumber = Rnum.nextInt(input + 1);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Guess a number between " + 0 + " " + randomNumber);
            System.out.println("Enter your Guess :" + "    chance " + i + "/3");
            input = sc.nextInt();

            if (input == randomNumber) {
                System.out.println("You Won");
                guessed = true;
                break;
            } else {
                System.out.println("You Guessed a Wrong Number");
                if (i < 3) {
                    System.out.println("Try again ");
                }
                System.out.println();
            }
        }
        if (!guessed) {
            System.out.println("Better luck Next Time ");
            System.out.println("The Generated Random Number is -> " + randomNumber);
        }
    }
}
