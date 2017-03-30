/**
 * Created by zsuzsanna.padar on 2017. 03. 30..
 */
public class Counter {
  public static void main(String[] args) {
   countDown(11);
  }

  public static  void countDown(int n) {
    if (n == 0) {
      return;
    } else {
      System.out.println(n);
      countDown(n - 1);
    }
  }
}
