/**
 * Created by zsuzsanna.padar on 2017. 03. 24..
 */
public class PalindromeBuilder {
  public static void main(String[] args) {
    System.out.println(createPalindrome(""));
    System.out.println(createPalindrome("greenfox"));
    System.out.println(createPalindrome("123"));
  }
  public static String createPalindrome(String word) {
    return word + new StringBuffer(word).reverse().toString();
  }
}
