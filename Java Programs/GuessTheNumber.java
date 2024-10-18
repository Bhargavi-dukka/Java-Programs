import java.util.Random;
import java.util.Scanner;
  
public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(25) + 1; 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess the number (between 1 and 25). You have 3 attempts.");
        int attempts = 3;
        for (int i = 1; i <= attempts; i++) {
            System.out.printf("Attempt %d:",i);
            System.out.println("enter your guess");
            int userGuess = scanner.nextInt();
            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the number correctly.");
                break;
            } else if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

            if (i == attempts) {
                System.out.printf("Sorry, you've used all your attempts. The number was: %d%n", randomNumber);
            }
        }
    }
}
