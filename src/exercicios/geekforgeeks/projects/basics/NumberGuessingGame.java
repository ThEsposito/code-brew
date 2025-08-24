package exercicios.geekforgeeks.projects.basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void numberGuessingGame() {
        int number = (int) (Math.random() * 100) + 1;
        int maxAttempts = 10;
        int attempts = 0;
        boolean win = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("A number is chosen is range 1...100");
        while (attempts < maxAttempts && !win) {
            System.out.print("You have " + (maxAttempts - attempts) + " attempts left. Try to guess it: ");
            try {
                int guess = sc.nextInt();
                if (guess < 1 || guess > 100) {
                    System.out.println("The number is between 1 and 100! Try again.");
                } else {
                    attempts++;
                    if (guess == number) {
                        System.out.println("Congrats! You guessed the correct number!");
                        win = true;
                    } else if (number > guess) {
                        System.out.println("The number is higher than your guess! Try again!");
                    } else {
                        System.out.println("The number is lower than your guess! Try again!");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Please, enter a valid expression!");
            }
            System.out.println();
        }
        if (win) {
            System.out.println("You won the game with "+attempts+ " attempts!");
        } else {
            System.out.println("You've exhausted all your attempts! The correct number was "+number+".");
        }
    }

    public static void main(String[] args) {
        numberGuessingGame();
    }
}
