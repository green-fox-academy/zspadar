import java.util.Scanner;

/**
 * Created by zsuzsanna.padar on 2017. 03. 22..
 */
public class Exercise29 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please give me a number!");
    int c = scanner.nextInt();


    for (int i = 1; i <= (c + 1); i = (i + 2)) {
      for (int j = 0; j < (((c - i) / 2) + 1); j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }

      for (int j = 0; j < (((c - i) / 2) + 1); j++) {
        System.out.print(" ");
      }
      System.out.println();
    }
    for (int i = (c - 2); i > 0; i --) {
      for (int j = 0; j < (((c - i) / 2) + 1); j++)  {
        System.out.print(" ");
      }
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      for (int j = 0; j < (((c - i) / 2) + 1); j++) {
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}



