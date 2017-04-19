import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by zsuzsanna.padar on 2017. 04. 19..
 */
public class SplitString {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    String userInput = scanner.nextLine();
    int numberOfChar = scanner.nextInt();
    System.out.println(Arrays.asList(getSplittedString(userInput,numberOfChar)));

  }

  public static String[] getSplittedString(String input, int number) {
    String[] splitted = new String[2];
    try {
      splitted[0] = input.substring(0, number);
      splitted[1] = input.substring(number, input.length());
    } catch (IndexOutOfBoundsException e) {
      System.out.println("The number is too big");
    }

    return splitted;
  }

}
