import com.sun.org.apache.xml.internal.serializer.utils.SystemIDResolver;

import java.util.Scanner;

/**
 * Created by zsuzsanna.padar on 2017. 03. 22..
 */
public class Exercise21 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("How many girls attended the part?");
    int girls = scanner.nextInt();

    System.out.println("How many boys attended the part?");
    int boys = scanner.nextInt();

    if ( (girls == boys)  && ( girls + boys ) > 20 ) {
      System.out.println("The party is excellent!");
    } else if ((( boys > girls) || (girls > boys) ) && (( girls + boys) > 20)) {
      System.out.println("Quite cool party!");
    } else if ( (girls + boys) < 20) {
      System.out.println("Average party...");
    }
    else if (girls == 0) {
      System.out.println("Sausage party");
    }
  }
}
// Write a program that asks for two numbers
// Thw first number represents the number of girls that comes to a party, the
// second the boys
// It should print: The party is exellent!
// If the the number of girls and boys are equal and there are more people coming than 20
//
// It should print: Quite cool party!
// It there are more than 20 people coming but the girl - boy ratio is not 1-1
//
// It should print: Average party...
// If there are less people coming than 20
//
// It should print: Sausage party
// If no girls are coming, regardless the count of the people