/**
 * Created by zsuzsanna.padar on 2017. 04. 19..
 */
public class Car {
  public CarType carType;
  public CarColor carColor;
  public int counter;

  public Car(CarType carType, CarColor carColor) {
    this.carType = carType;
    this.carColor = carColor;
    this.counter = 0;
  }

  public String toString(){
    return counter + " " + carType + "\n" + counter + " " + carColor;
  }
}
