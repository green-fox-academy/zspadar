import java.util.Scanner;

/**
 * Created by zsuzsanna.padar on 2017. 03. 21..
 */
public class Exercise18 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Give me a number!");
    int userInput = scanner.nextInt();


    if (userInput % 2 == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }
  }
}


