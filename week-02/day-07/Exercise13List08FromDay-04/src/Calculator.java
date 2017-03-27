import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by zsuzsanna.padar on 2017. 03. 26..
 */
public class Calculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please, type in an expression!");
   // ArrayList<String> = new ArrayList<>(Arrays.asList(scanner.nextInt()));
    int userInput = scanner.nextInt();
    switch (userInput = {operation, operand1, operand2}) {
    }

    if (operation != "*") {
      if (operation == "/") {
        System.out.println(operand1 / operand2);
      } else if (operation == "-") {
        System.out.println(operand1 + operand2);
      } else if (operation == "+") {
        System.out.println(operand1 + operand2);
      } else if (operation == "%"){
        System.out.println( operand1 % operand2);
      }
    } else {
      System.out.println(operand1 * operand2);
    }
  }
}
// Create a simple calculator application which reads the parameters from the prompt
// and prints the result to the prompt.
// It should support the following operations:
// +, -, *, /, % and it should support two operands.
// The format of the expressions must be: {operation} {operand} {operand}.
// Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

// You can use the Scanner class
// It should work like this:

// Start the program
// It prints: "Please type in the expression:"
// Waits for the user input
// Print the result to the prompt
// Exit
