/**
 * Created by zsuzsanna.padar on 2017. 03. 30..
 */
public class StringAgainAndAgain {
  public static void main(String[] args) {
    System.out.println(stringWithStarts("stars"));
  }

  public static String stringWithStarts(String word) {
    if(word.length() == 1) {
      return word;
    } else {
      return word.charAt(0) + "*" + stringWithStarts(word.substring(1));
    }
  }
}
