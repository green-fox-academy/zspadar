/**
 * Created by zsuzsanna.padar on 2017. 03. 23..
 */
public class Reverse {
  public static void main(String... args) {
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";


    System.out.println(reverse(reversed));

  }

  public static String reverse(String sentence) {
    String firstchar = " ";
    for (int i = sentence.length() - 1; i >= 0; i--) {
      firstchar = firstchar + sentence.charAt(i);
    }
    return firstchar;
  }

}


    // Create a function that can reverse a String, which is passed as the parameter
    // Use it on this reversed string to check it!
    // Try to solve this using charAt() first, and optionally anything else after.


