/**
 * Created by zsuzsanna.padar on 2017. 03. 26..
 */
public class FizzBuzz {
  public static void main(String[] args) {
    int print = 100;
    System.out.println("I'm going to print the numbers fro 1 to 100. Ready?!");

    for (int i = 0; i <= print; i++) {
      System.out.println();
      if (i % 3 == 0 && i % 5 != 0) {
        System.out.println("Fizz");
      } else if ( i % 5 == 0 && i % 3 != 0) {
        System.out.println("Buzz");
      } else if (i % 3 == 0 && i % 5 == 0) {
          System.out.println("FizzBuzz");
      } else {
        System.out.println(i);
      }
    }
  }
}
// Write a program that prints the numbers from 1 to 100.
// But for multiples of three print “Fizz” instead of the number
// and for the multiples of five print “Buzz”.
// For numbers which are multiples of both three and five print “FizzBuzz”.
