import java.util.Scanner;


/**
 * Created by zsuzsanna.padar on 2017. 03. 21..
 */
public class Exercise19 {
  public  static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please, give me a number!");
    int userinput = scanner.nextInt();

    if (userinput <= 0) {
      System.out.println("Not enough");
    } else if (userinput == 1) {
      System.out.println("One");
    } else if (userinput == 2) {
      System.out.println("Two");
    } else{
      System.out.println("A lot");
    }

  }

  // Write a program that reads a number form the standard input,
// If the number is zero or smaller it should print: Not enough
// If the number is one it should print: One
// If the number is two it should print: Two
// If the number is more than two it should print: A lot
}
