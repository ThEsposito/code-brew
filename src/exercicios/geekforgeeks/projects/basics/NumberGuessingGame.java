package exercicios.geekforgeeks.projects.basics;
/*
RULES OF THE GAME:
    - If the guessed number is bigger than the actual number, the program will respond with the message that the
      guessed number is higher than the actual number.
    - If the guessed number is smaller than the actual number, the program will respond with the message that the
      guessed number is lower than the actual number.
    - If the guessed number is equal to the actual number or if the K trials are exhausted, the program will end
      with a suitable message.

IMPLEMENTATION DETAILS:
    - The program generates a random number between a predefined range (e.g., 1 to 100).
    - The user has limited attempts (K tries) to guess the number.
    - At each guess, the program provides a hint:
        - If the guessed number is higher, it tells the user to guess lower.
        - If the guessed number is lower, it tells the user to guess higher.
    - If the user guesses correctly, they win.
    - If all attempts are exhausted, the game reveals the correct number.

More details: https://www.geeksforgeeks.org/dsa/number-guessing-game-in-java/
 */
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
