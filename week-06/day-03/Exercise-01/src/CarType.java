import java.util.Random;

/**
 * Created by zsuzsanna.padar on 2017. 04. 19..
 */
public enum CarType {
  DODGE, MUSTANG, CHEVROLET, BUICK;

  public static CarType getRandType() {
    Random random = new Random();
    int getRand = random.nextInt(CarColor.values().length);
    return CarType.values()[getRand];
  }

}
