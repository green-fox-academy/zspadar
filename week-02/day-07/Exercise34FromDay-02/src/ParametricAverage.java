import java.util.Scanner;

/**
 * Created by zsuzsanna.padar on 2017. 03. 26..
 */
public class ParametricAverage {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please give me a number");
    double userInput = scanner.nextInt();
    int sum = 0;

    for (int i = 0; i < userInput; i++) {
      System.out.println("Please give me an integer!");
      int numbers = scanner.nextInt();
      sum = sum + numbers;
    }
    System.out.println("Now, that all the integers are entered, I'm gonna give you the sum and average of these numbers!");

    System.out.println("The sum is: " + sum + " The average is: " + sum / userInput);
  }
}


// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4
