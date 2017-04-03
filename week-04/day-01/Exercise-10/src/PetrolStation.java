/**
 * Created by zsuzsanna.padar on 2017. 04. 03..
 */
public class PetrolStation {
  public static void main(String[] args) {
    Station station = new Station();
    Car car = new Car(0, 100);

    station.refill(car,36);

    System.out.println(car.gasAmount);
    System.out.println(station.gasAmount);
  }
}
