import java.util.Scanner;

/**
 * Created by zsuzsanna.padar on 2017. 03. 22..
 */
public class Exercise29 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please give me a number!");
    int c = scanner.nextInt();


    for (int i = 0; i < c + 1; i ++) {
      for (int j = 0; j < c; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }

      for (int j = 0; j < i ; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }
    for (int i = (c - 1); i > 0; i --) {
      for (int j = 0; j < c; j++)  {
        System.out.print(" ");
      }
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      for (int j = 0; j < c; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}



