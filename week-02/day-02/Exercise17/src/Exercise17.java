import java.util.Scanner;

/**
 * Created by zsuzsanna.padar on 2017. 03. 21..
 */
public class Exercise17 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.printf("Give a number!");

    int number1 = scanner.nextInt();

    System.out.println("Give me an other number");

    int number2 = scanner.nextInt();
    System.out.println("Give me an other number");

    int number3 = scanner.nextInt();
    System.out.println("Give me and another number");

    int number4 = scanner.nextInt();
    System.out.println("Give me the last number");

    int number5 = scanner.nextInt();


    System.out.println("Sum: " + (number1 + number2 + number3 + number4 + number5) + ",  Average: " +
    (number1 + number2 + number3 + number4 + number5) / 5 );
  }
}
