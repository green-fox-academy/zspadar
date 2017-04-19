import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsuzsanna.padar on 2017. 04. 19..
 */
public class ParkingLot {
  public static void main(String[] args) {
    List<Car> carsAtParkingLot = new ArrayList<>();
    for(int i = 0; i < 256; i++){
      carsAtParkingLot.add(new Car(CarType.getRandType(),CarColor.getRandColor()));
    }
  }
}
