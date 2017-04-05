/**
 * Created by zsuzsanna.padar on 2017. 04. 05..
 */
public class Fibonacci {
  public static int fibonacci(int n) {
    if (n == 1) {
      return 0;
    } else if (n == 2) {
      return 1;
    } else {
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }
}
