/**
 * Created by zsuzsanna.padar on 2017. 03. 30..
 */
public class SumDigit {
  public static void main(String[] args) {
    System.out.println(sumDigit(1254));
  }

  public static int sumDigit(int n) {
    int rightMost = n % 10;
    int left = n / 10;
    if (left == 0) {
      return rightMost;
    } else {
      return rightMost + sumDigit (left);
    }

  }
}
