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
      splitted[0] = input.substring(0, number - 1);
      splitted[1] = input.substring(number, input.length()-1);
    } catch (IndexOutOfBoundsException e) {
      System.out.println("The number is too big");
    }

    return splitted;
  }

}
//  Write a function that receives a string and an integer
//  The function should return an array of strings, with two string in it
//        The first string should be the first part of the original string
//        Characters in range [0,index-1].
//        The second part should be the rest of the string characters range [index,length-1]
//        Example: split("lovebarbara", 4)
//        Result: {"love", "barbara"}
//        Handle the exception if the index is out of bounds
