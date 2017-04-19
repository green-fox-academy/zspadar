import java.util.Random;

/**
 * Created by zsuzsanna.padar on 2017. 04. 19..
 */
public enum CarColor {
  RED, BLUE, GREEN;

  CarColor() {
  }


  public static CarColor getRandColor() {
    Random random = new Random();
    int getRand = random.nextInt(CarColor.values().length);
    return CarColor.values()[getRand];
  }
}
