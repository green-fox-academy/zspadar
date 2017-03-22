import java.util.Scanner;

/**
 * Created by zsuzsanna.padar on 2017. 03. 22..
 */
public class Exercise26 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please give me a number!");
    int u1 = scanner.nextInt();
     for ( int i = 1; i < 11; i++ ) {
       System.out.println( i + "*" + u1 + "=" + (u1 * i));
     }
  }
}
