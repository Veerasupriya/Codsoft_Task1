import java.util.Scanner;
import java.util.Random;
public class GuessingGame{
public static void main(String[] args) 
{
Scanner input = new Scanner(System.in);
Random random = new Random();
int lowerBound = 1;
int upperBound = 100;
int attempts = 8;
int score = 0;
System.out.println("Welcome to the Game!");
while (true) {
            int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            System.out.println("A random number between 1 and 100 has been generated. You have " + attempts + " attempts.");
            for (int i = 1; i <= attempts; i++) {
                System.out.print("Enter your guess: ");
                int userGuess = input.nextInt();
                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! Your guess is correct.");
                    score++;
                    break;
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }

                if (i == attempts) {
                    System.out.println("Out of attempts. The correct number was: " + randomNumber);
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = input.next();

            if (!playAgain.equalsIgnoreCase("yes")) {
                System.out.println("Game over. Your total score is: " + score);
                break;
            }
        }

        input.close();
    }
}
