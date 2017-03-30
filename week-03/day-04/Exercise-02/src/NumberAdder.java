/**
 * Created by zsuzsanna.padar on 2017. 03. 30..
 */
public class NumberAdder {
  public static void main(String[] args) {
    System.out.println(addNumber(30));

  }

  public static int addNumber (int n) {
    if (n == 1) {
      return n;
    } else {
      return  n + addNumber(n -1);
    }
  }
}
