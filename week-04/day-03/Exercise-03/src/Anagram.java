/**
 * Created by zsuzsanna.padar on 2017. 04. 05..
 */
public class Anagram  {
  String word1;
  String word2;

  public Anagram(String word1, String word2) {
    this.word1 = word1;
    this.word2 = word2;
  }


  public static boolean isAnagram(String word1, String word2) {
    return word1.equals(new StringBuffer(word2).reverse().toString());
  }
}
