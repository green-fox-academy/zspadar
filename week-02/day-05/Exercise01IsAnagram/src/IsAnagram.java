/**
 * Created by zsuzsanna.padar on 2017. 03. 24..
 */
public class IsAnagram {
  public static void main(String[] args) {
    System.out.println(isAnagram( "dog", "god"));
    System.out.println(isAnagram("green", "fox"));
  }

  public static boolean isAnagram(String word1, String word2) {
    return word1.equals(new StringBuffer(word2).reverse().toString());
  }
}
