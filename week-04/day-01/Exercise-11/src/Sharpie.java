/**
 * Created by zsuzsanna.padar on 2017. 04. 03..
 */
public class Sharpie {
  String color;
  Float width;
  Float inkAmount;

  public Sharpie( String color, Float width) {
    this.color = color;
    this.width = width;
    inkAmount = (float)100;
  }

  public void use() {

    inkAmount -= 1;
  }

}
