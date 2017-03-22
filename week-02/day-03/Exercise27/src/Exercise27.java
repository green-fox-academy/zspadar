import java.util.Scanner;

/**
 * Created by zsuzsanna.padar on 2017. 03. 22..
 */
public class Exercise27 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please give me a number!");
    int ui = scanner.nextInt();

    for (int i =1; i <= (ui + 1); i++) {
      for (int j = 1; j < i; j++) {
        System.out.print("*");
      }
      System.out.println(" ");
    }
  }
}
// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was