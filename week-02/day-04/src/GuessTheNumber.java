import java.util.Scanner;

/**
 * Created by zsuzsanna.padar on 2017. 03. 23..
 */
public class GuessTheNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("I will think of a number, your job is to figure it out! Shall we start?");
    int userInput = scanner.nextLine();

    if (userInput !=) {
      if (userInput <) {
        System.out.println("The stored number is higher");
      }
      if (userInput > ) {
        System.out.println("The stored number is lower");
      }
      else {
        System.out.println("You found the number: " + );
      }
    }
  }
}
// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8