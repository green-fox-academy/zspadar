import java.util.Scanner;

/**
 * Created by zsuzsanna.padar on 2017. 03. 21..
 */
public class Exercise15 {
  public static void main(String[] args) {
    // Write a program that asks for an integer that is a distance in kilometers,
    // then it converts that value to miles and prints it
    double mile = 0.621371192;

    Scanner scanner = new Scanner(System.in);

    System.out.printf("Give me a number in kms!");

    int userInput = scanner.nextInt();

    System.out.println("This is " + (userInput * mile) + "in miles!");

  }
}
