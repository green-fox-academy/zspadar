import java.util.Scanner;

/**
 * Created by zsuzsanna.padar on 2017. 03. 21..
 */
public class Exercise14 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Modify this program to greet user instead of the World!
    // The program should ask for the name of the user
    System.out.printf("Hello, what is your name?");
    String userInput = scanner.nextLine();
    System.out.println("Hello," + userInput);


  }
}