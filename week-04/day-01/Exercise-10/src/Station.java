/**
 * Created by zsuzsanna.padar on 2017. 04. 03..
 */
public class Station {
  public int gasAmount = 600;

  public void refill (Car car, int gas) {
    gasAmount -= car.capacity;
    car.gasAmount += gas;

  }



}
