import java.util.Scanner;

/**
 * Created by zsuzsanna.padar on 2017. 03. 22..
 */
public class Exercise29 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please give me an ODD number!");
    int c = scanner.nextInt();


    for (int i = 0; i < c / 2 + 1; i ++) {
      for (int j = 0; j < c / 2 - i; j ++) {
        System.out.print(" ");
      }
      for (int s = 0; s < i * 2 +1; s++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}


