/**
 * Created by zsuzsanna.padar on 2017. 03. 30..
 */
public class OddEvenBunnies {
  public static void main(String[] args) {
    System.out.println(oddEvenBunnyEarCounter(12));
  }

  public static int oddEvenBunnyEarCounter(int n) {
    if (n == 1) {
      return 2;
    } else {
      if (n % 2 == 0) {
        return 2 + oddEvenBunnyEarCounter(n - 1);
      } else {
        return 3 + oddEvenBunnyEarCounter(n - 1);
      }
    }
  }
}
