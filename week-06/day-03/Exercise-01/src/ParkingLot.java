import java.util.ArrayList;
import java.util.HashMap;
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


    HashMap<CarColor, Integer> colorCounter = new HashMap<>();
    for(int i = 0; i < carsAtParkingLot.size(); i ++) {
      Integer counter = colorCounter.get(carsAtParkingLot.get(i).carColor);
      if (counter == 0) {
        counter = 0;
      } else {
        counter++;
      }
    }

    for(CarColor color : colorCounter.keySet()){
      String key = color.toString();
      String value = colorCounter.get(color).toString();
      System.out.println(key + " "  + value);
    }

    HashMap<CarType, Integer> typeCounter = new HashMap<>();
    for(int i = 0; i < carsAtParkingLot.size(); i ++) {
      Integer counter = typeCounter.get(carsAtParkingLot.get(i).carType);
      if (counter == 0) {
        counter = 0;
      } else {
        counter++;
      }
    }

    for(CarType type: typeCounter.keySet()){
      String key = type.toString();
      String value = colorCounter.get(type).toString();
      System.out.println(key + " "  + value);
    }


  }
}
