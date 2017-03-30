/**
 * Created by zsuzsanna.padar on 2017. 03. 30..
 */
public class StringLowercase {
  public static void main(String[] args) {
    System.out.println(lowerCase("Bxtxasx"));
  }

  public static String lowerCase(String word) {
    String manipulated;
    if (word.length() == 0) {
      return word;
    }
    if (word.charAt(0) == 'x') {
       manipulated = "y";
    } else {
       manipulated = word.substring(0,1);
    }
    if (word.length() == 1) {
      return manipulated;
    } else {
      return manipulated.concat(lowerCase(word.substring(1, word.length() -1)));
    }

  }
}
