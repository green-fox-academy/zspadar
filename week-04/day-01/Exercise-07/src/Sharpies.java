/**
 * Created by zsuzsanna.padar on 2017. 04. 03..
 */
public class Sharpies {
  public static void main(String[] args) {
    Sharpie blue = new Sharpie();

    System.out.println(blue.inkAmount);

    blue.use();
    System.out.println(blue.inkAmount);
    blue.color = "blue";
    blue.width = 23.2f;

  }




}
