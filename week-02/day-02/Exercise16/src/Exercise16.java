import java.util.Scanner;

/**
 * Created by zsuzsanna.padar on 2017. 03. 21..
 */
public class Exercise16 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.printf("How many chickens do you have?");

    int chicken = scanner.nextInt();

    System.out.println("How many pigs do you have?");

    int pig = scanner.nextInt();

    System.out.println("The farmer has " + (chicken * 2 + pig * 4) + " legs.");

  }
}
