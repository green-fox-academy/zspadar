import java.util.Scanner;

/**
 * Created by zsuzsanna.padar on 2017. 03. 22..
 */
public class Exercise28 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please give me a number!");
    int c = scanner.nextInt();


    for (int i = 1; i <= (c + 1); i = (i + 2)) {
      for (int j = 1; j < ((c - i) / 2) + 1; j += 1) {
        System.out.print(" ");
      }
      System.out.println("*");
    }
  }
}

// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was