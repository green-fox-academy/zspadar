import java.util.Scanner;

/**
 * Created by zsuzsanna.padar on 2017. 03. 26..
 */
public class DrawDiagonal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please, give me a number, so I can draw you a square with a diagonal!");
    int userInput = scanner.nextInt();

    for (int i = 0; i < userInput; i++) {
      System.out.println();
      if (i == 0 || i == userInput - 1) {
        for (int j = 0; j < userInput; j++) {
          System.out.print("%");
        }
      } else {
        for (int k = 0; k < userInput; k++) {
          if (k == 0 || k == userInput - 1 || k == i) {
            System.out.print("%");
          } else {
            System.out.print(" ");
          }
        }
      }
    }
  }
}

// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was
