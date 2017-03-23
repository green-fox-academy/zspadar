/**
 * Created by zsuzsanna.padar on 2017. 03. 23..
 */
import java.util.*;

public class QuoteSwap{
  public static void main(String... args){
    ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

    String temp1 = list.get(2);
    String temp2 = list.get(5);
    list.set(2, temp2);
    list.set(5, temp1);
    System.out.println(String.join(" ", list));
    // 2,5; 5, 2
    // Accidentally I messed up this quote from Richard Feynman.
    // Two words are out of place
    // Your task is to fix it by swapping the right words with code

    // Also, print the sentence to the output with spaces in between.
  }
}
