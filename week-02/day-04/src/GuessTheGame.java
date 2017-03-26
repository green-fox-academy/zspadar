import java.util.Scanner;

/**
 * Created by zsuzsanna.padar on 2017. 03. 23..
 */
public class GuessTheGame {
  public static void main(String[] args) {
    int stored = 147;
    Scanner scanner = new Scanner(System.in);
    System.out.println("I will think of a number, your job is to figure it out! Shall we start?");
    int userInput = scanner.nextInt();


    while (userInput != stored) {
      if (userInput < stored) {
        System.out.println("The stored number is higher");
      } else {
        System.out.println("The stored number is lower");
      }
      userInput = scanner.nextInt();
    }
    System.out.println("You found the number: " + stored);
  }
}

// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8

