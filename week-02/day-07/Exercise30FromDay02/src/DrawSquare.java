import java.util.Scanner;

/**
 * Created by zsuzsanna.padar on 2017. 03. 26..
 */
public class DrawSquare {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Give me a number, so i could draw a square for you!");
    int userInput = scanner.nextInt();

    for (int i = 0; i < userInput; i++) {
      System.out.println();
      if ( i == 0 || i == userInput-1) {
        for (int j = 0; j< userInput; j++) {
          System.out.print("%");
        }
      }else {
        for (int k = 0; k < userInput; k++){
          if (k == 0 || k == userInput  - 1) {
            System.out.print("%");
          } else {
            System.out.print(" ");
          }
        }
      }
    }
  }
}



