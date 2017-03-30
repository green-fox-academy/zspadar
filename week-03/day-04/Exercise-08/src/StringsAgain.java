/**
 * Created by zsuzsanna.padar on 2017. 03. 30..
 */
public class StringsAgain {
  public static void main(String[] args) {
    System.out.println(removeXes("Stxxerrtglxexs"));
  }

  public static String removeXes(String word) {
    if (word.length() == 0) {
      return word;
    }
    if (word.charAt(0) == 'x') {
      return  removeXes(word.substring(1));
    } else {
      return  word.charAt(0) + removeXes(word.substring(1));
    }
  }
}
