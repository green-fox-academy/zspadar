/**
 * Created by zsuzsanna.padar on 2017. 03. 30..
 */
public class Bunny {
  public static void main(String[] args) {
    System.out.println(bunnies(11));
  }

  public static int bunnies(int n) {
    if (n == 1) {
      return  2;
    } else {
      return 2 + bunnies(n - 1);
    }
  }
}
