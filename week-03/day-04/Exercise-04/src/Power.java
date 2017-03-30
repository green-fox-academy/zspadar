/**
 * Created by zsuzsanna.padar on 2017. 03. 30..
 */
public class Power {
  public static void main(String[] args) {
    System.out.println(powerN(2, 4));
  }

  public static int powerN(int x, int y) {
    if ( y == 1 ) {
      return x;
    } else {
      return x * powerN(x, y-1);
    }
  }
}
